a, b, n, w = map(int, input().split())
x = []
for i in range(1, n):
    if a*i + b*(n-i) == w:
        x.append([i, n-i])
if x and len(x) == 1:
    print(*x[0])
else:
    print(-1)