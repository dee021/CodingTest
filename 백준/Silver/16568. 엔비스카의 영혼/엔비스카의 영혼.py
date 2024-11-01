n, a, b = map(int, input().split())

dp = [float('inf') for _ in range(n+1)]
dp[-1] = 0

for i in range(n-1, -1, -1):
    dp[i] = min(dp[i], dp[i+1]+1)
    if i + a < n:
        dp[i] = min(dp[i], dp[i+a+1]+1)
    if i + b < n:
        dp[i] = min(dp[i], dp[i+b+1]+1)

print(dp[0])