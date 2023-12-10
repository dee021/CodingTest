n, m, k = map(int, input().split())
dp = [[0 for _ in range(m)] for _ in range(n)]
dp[0] = [1]*m

for r in range(1, n):
    for c in range(m):
        if not c:
            dp[r][c] = dp[r-1][c]
        else:
            dp[r][c] = dp[r-1][c] + dp[r][c-1]

r, c = (k-1)//m, (k-1)%m
print(k and dp[r][c]*dp[n-r-1][m-c-1] or dp[n-1][m-1])