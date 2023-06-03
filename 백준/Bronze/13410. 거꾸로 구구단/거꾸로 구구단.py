ans = 0
n, k = map(int, input().split())

for i in range(1, k+1):
    m = int(str(n*i)[::-1])
    if ans < m:
        ans = m
print(ans)