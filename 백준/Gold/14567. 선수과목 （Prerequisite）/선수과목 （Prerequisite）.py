import sys
input = sys.stdin.readline

n, m = map(int, input().split())
ans = [1 for _ in range(n+1)]
d = {}

for _ in range(m):
    a, b = map(int, input().split())
    d.setdefault(a, []).append(b)

for k in range(1,n+1):
    if k not in d:
        continue
    for v in d[k]:
        ans[v] = max(ans[v], ans[k]+1)
print(*ans[1:])    