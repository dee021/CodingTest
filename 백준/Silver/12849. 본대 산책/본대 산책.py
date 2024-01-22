M = 1000000007
time = int(input())

dp = [[0 for _ in range(8)] for _ in range(time + 1)]
dp[0][0] = 1

for r in range(time):
    dp[r+1][0] = (dp[r][1] + dp[r][2]) % M
    dp[r+1][1] = (dp[r][0] + dp[r][2] + dp[r][3]) % M
    dp[r+1][2] = (dp[r][0] + dp[r][1] + dp[r][3] + dp[r][4]) % M
    dp[r+1][3] = (dp[r][1] + dp[r][2] + dp[r][4] + dp[r][5]) % M
    dp[r+1][4] = (dp[r][2] + dp[r][3] + dp[r][5] + dp[r][7]) % M
    dp[r+1][5] = (dp[r][3] + dp[r][4] + dp[r][6]) % M
    dp[r+1][6] = (dp[r][5] + dp[r][7]) % M
    dp[r+1][7] = (dp[r][4] + dp[r][6]) % M
print(dp[time][0])