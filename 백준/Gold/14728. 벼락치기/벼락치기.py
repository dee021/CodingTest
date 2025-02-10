import sys
input = sys.stdin.readline

n, t = map(int, input().split())
arr = [tuple(map(int, input().split())) for _ in range(n)]
dp = [[0 for _ in range(t+1)] for _ in range(n+1)]

for i in range(n):
    for j in range(1, t+1):
        if arr[i][0] <= j:
            dp[i+1][j] = max(dp[i][j], dp[i][j-arr[i][0]] + arr[i][1])
        else:
            dp[i+1][j] = dp[i][j]

print(dp[n][t])