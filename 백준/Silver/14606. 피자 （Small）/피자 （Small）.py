dp = [0 for _ in range(int(input()))]

for i in range(1, len(dp)):
    dp[i] = dp[i-1] + i
print(dp[-1])