n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
wook = [[0]*m for _ in range(n)]
wook[0] = [sum(arr[0][:i]) for i in range(1,m+1)]

for r in range(1, n):
    for c in range(m):
        if c == 0:
            wook[r][0] = wook[r-1][0] + arr[r][0]
        else:
            wook[r][c] = max(wook[r-1][c], wook[r][c-1]) + arr[r][c]
print(wook[n-1][m-1])