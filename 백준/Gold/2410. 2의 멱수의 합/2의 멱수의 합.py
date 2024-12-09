M = 1_000_000_000
n = int(input())
dp = [0 for _ in range(n+1)]
dp[1] = 1

for k in range(2, n+1):
    dp[k] = dp[k-1]
    if k%2 == 0:
        dp[k] += dp[k//2]
        dp[k] %= M
print(dp[n])