import sys
input = sys.stdin.readline

n, k = map(int, input().split())
ans = 0
arr = [[0,0]]+[list(map(int, input().split())) for _ in range(k)]
dp = [[0 for _ in range(n+1)] for _ in range(k+1)]

for i in range(k+1):
    for j in range(n+1):
        if arr[i][1] <= j:
            dp[i][j] = max(dp[i-1][j], dp[i-1][j-arr[i][1]] + arr[i][0])
        else:
            dp[i][j] = dp[i-1][j]

print(dp[k][n])