n = int(input())
m = int(input())

dp = [[1 for _ in range(m)] for _ in range(n)]
for i in range(1, n):
    for j in range(1, m):
        dp[i][j] = dp[i][j-1] + dp[i-1][j]
print(dp[n-1][m-n])