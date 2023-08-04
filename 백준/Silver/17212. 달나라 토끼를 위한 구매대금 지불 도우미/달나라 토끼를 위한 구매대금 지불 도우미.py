n = int(input())
dp = [0 for _ in range(n+1)] 

for i in range(n+1):
    if i <= 7:
        dp[i] = [0, 1, 1, 2, 2, 1, 2, 1][i]
        continue
    dp[i] = min(dp[i-1], dp[i-2], dp[i-5], dp[i-7]) +1
print(dp[n])