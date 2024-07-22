M = 10**9+7
n = int(input())
dp = [[1] * 5] + [[0 for _ in range(5)] for _ in range(n-1)]

for i in range(1, n):
    dp[i][0] = sum(dp[i-1][1:]) % M
    dp[i][1] = (dp[i-1][0] + dp[i-1][3] + dp[i-1][4]) % M
    dp[i][2] = (dp[i-1][0] + dp[i-1][4]) % M
    dp[i][3] = (dp[i-1][0] + dp[i-1][1]) % M
    dp[i][4] = sum(dp[i-1][:3])%M
print(sum(dp[-1]) % M)