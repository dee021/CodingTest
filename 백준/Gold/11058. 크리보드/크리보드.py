n = int(input())
dp = [0,1,2,3] + [0 for _ in range(n-3)]

for i in range(4, n+1):
    dp[i] = dp[i-1] +1
    for j in range(2, i-1):
        dp[i] = max(dp[i], dp[i - j - 1] *j)
print(dp[n])