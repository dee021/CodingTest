n = int(input())
dp = [[0,0] for _ in range(n+1)]
dp[1] = [0,1]

for i in range(2, n+1):
    dp[i] = [sum(dp[i-1]), sum(dp[i-1])]
    if i % 2 == 0 and i >= 4:
        dp[i][0] -= dp[i-3][1]
    if i % 2 == 0 and i >= 6:
        dp[i][0] -= dp[i-4][1]
print(sum(dp[-1])) 