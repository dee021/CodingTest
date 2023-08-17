import sys
input = sys.stdin.readline
t = 1
while True:
    n = int(input())
    if not n:
        break
    g = [list(map(int, input().split())) for _ in range(n)]
    dp = [[0,0,0] for _ in range(n-1)]
    dp[0][0] = g[0][1] + g[1][0]
    dp[0][1] = min(0, g[1][0], g[0][2]) + g[0][1] + g[1][1]
    dp[0][2] = min(0, g[1][0]+g[1][1], g[1][1], g[0][2]+g[1][1], g[0][2]) + g[0][1] + g[1][2]
    for i in range(1, n-1):
        dp[i][0] = min(dp[i-1][0], dp[i-1][1]) + g[i+1][0]
        dp[i][1] = min(dp[i][0], dp[i-1][0], dp[i-1][1], dp[i-1][2]) + g[i+1][1]
        dp[i][2] = min(dp[i][1], dp[i-1][1], dp[i-1][2]) + g[i+1][2]
    print('{}. {}'.format(t, dp[n-2][1]))
    t += 1