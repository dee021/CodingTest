M = 1_000_000_009
n = int(input())
dp = [[0,0] for _ in range(500001)]
dp[1] = dp[2] = [1,0]

for i in range(3, n+1):
    dp[i][0] = sum(dp[i-1]) % M
    dp[i][1] = dp[i-2][0]
print(sum(dp[n])%M)