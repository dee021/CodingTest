sol = lambda x: (len(str(x)) if x != 100 else 0) + abs(int(n)-x)

n = input(); l = len(n)
m = int(input())
btn = []
if 0 <  m < 10:
    btn = list(map(int, input().split()))
elif m == 10:
    print(abs(int(n)-100))
    exit(0)
else:
    print(min([l, abs(int(n)-100)]))
    exit(0)
btn = [str(x) for x in range(10) if x not in btn]
arr = [[x for x in btn]]

for lv in range(l):
    if lv and len(arr) == 1:
        break
    tmp = []
    for nd in arr[lv]:
        if nd == '0':
            continue
        tmp.extend([nd+x for x in btn])
    if tmp:
        arr.append(tmp)

ans = [100]
if len(arr) > 1:
    ans.append(int(arr[l-2][-1]))
    ans.append(int(arr[l][0]))
    ans.append(sorted([int(x) for x in arr[l-1]], key=lambda x: abs(int(n)-x))[0])
else:
    ans.extend(list(map(int, arr[0])))
print(min(list(map(sol, ans))))