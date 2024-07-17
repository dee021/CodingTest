n, p, q = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

ans = []
t = p-q
flag = 1
for i in range(n):
    if not p - q:
        if a[i] != b[i]:
            flag = 0
            break
        ans.append(0)
    else:
        r = (b[i] - a[i])/t
        if r < 0 or r != int(r):
            flag = 0
            break
        ans.append(int(r))
if flag:
    print('YES')
    print(*ans)
else:
    print('NO')