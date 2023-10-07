n, s, m = map(int, input().split())
arr = list(map(int, input().split()))
t = [[s]]
for i in range(n):
    tmp = set()
    p = arr[i]
    for pre in t[-1]:
        if pre - p >= 0:
            tmp.add(pre-p)
        if pre + p <= m:
            tmp.add(pre+p)
    if not tmp:
        print(-1)
        break
    t.append(tmp)
else:
    print(max(t[-1]))