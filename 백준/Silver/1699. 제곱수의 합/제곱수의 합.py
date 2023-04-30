n = int(input())
dp = [0 for _ in range(n+1)]

for i in range(1,n+1):
    dp[i] = 1+dp[i-1]
    for j in range(2, int(i**0.5)+1, 1):
        if dp[i] > 1 + dp[i-j*j]:
            dp[i] = 1 + dp[i-j*j]
print(dp[n])