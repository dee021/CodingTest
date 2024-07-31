m, n, k, w = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(m)]
b = [[0 for _ in range(n-w+1)] for _ in range(m-w+1)]

for c in range(n-w+1):
    s = []
    for r in range(w-1):
        s.extend(a[r][c:c+w])
    for r in range(m-w+1):
        s.extend(a[r+w-1][c:c+w])
        b[r][c] = sorted(s)[w**2//2]
        del s[:w]
for r in range(m-w+1):
    print(*b[r])