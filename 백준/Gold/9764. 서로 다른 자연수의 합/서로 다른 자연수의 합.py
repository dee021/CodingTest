import sys
input = sys.stdin.readline

n = 2000
M = 100999

dp = [[0 for _ in range(n+1)] for _ in range(n+1)]
dp[0][0] = 1

for i in range(1, n+1):
    dp[0][i] = 1
    for j in range(1, n+1):
        dp[i][j] = dp[i][j-1]
        if i >= j:
            dp[i][j] += dp[i-j][j-1]
            dp[i][j] %= M

for _ in range(int(input())):
    n = int(input())
    print(dp[n][n])