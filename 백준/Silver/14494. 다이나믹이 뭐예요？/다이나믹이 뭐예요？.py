M = 10**9 + 7
n, m = map(int, input().split())

dp = [[0 for _ in range(m)] for _ in range(n)]
for i in range(max(n, m)):
    if i < n: dp[i][0] = 1
    if i < m: dp[0][i] = 1

for r in range(1, n):
    for c in range(1, m):
        dp[r][c] = (dp[r-1][c] + dp[r][c-1] + dp[r-1][c-1])%M
print(dp[n-1][m-1])