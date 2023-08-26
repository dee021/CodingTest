n = int(input())
rc = [[0 for _ in range(n+1)] for _ in range(n+1)]
rc[0] = [1 for _ in range(n+1)]

for i in range(1, n+1):
    rc[i][0] = 1
    for j in range(1, n+1):
        rc[i][j] = rc[i-1][j] + rc[i][j-1]
print(rc[n][n], n**2)