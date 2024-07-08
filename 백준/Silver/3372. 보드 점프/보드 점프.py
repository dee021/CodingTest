import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [[0 for _ in range(n)] for _ in range(n)]
dp[0][0] = 1
for i in range(n):
    for j in range(n):
        if i == n-1 == j:
            continue
        r, c = i + arr[i][j], j + arr[i][j]
        if 0 <= r < n:
            dp[r][j] += dp[i][j]
        if 0 <= c < n:
            dp[i][c] += dp[i][j]
print(dp[n-1][n-1])