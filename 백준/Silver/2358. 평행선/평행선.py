import sys
input = sys.stdin.readline

x = {}
y = {}
n = int(input())
for _ in range(n):
    u, v = map(int, input().split())
    if u in x:
        x[u].append(v)
    else:
        x[u] = [v]
    if v in y:
        y[v].append(u)
    else:
        y[v] = [u]
ans = 0
for k in x.keys():
    if len(x[k]) >= 2:
        ans += 1
for k in y.keys():
    if len(y[k]) >= 2:
        ans += 1
print(ans)