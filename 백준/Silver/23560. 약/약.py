n = int(input())

dp = [0 for _ in range(3*n)]
dp[0] = 2
for i in range(1, 3*n):
    if i%3 == 0:
        dp[i] = dp[i-1] + dp[i-2]
    elif i%3 == 2 and i < 3*n-1:
        dp[i] = dp[i-1] * 2
    else:
        dp[i] = dp[i-1]
print(dp[-1])