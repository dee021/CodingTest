import sys
input = sys.stdin.readline

h, w = map(int, input().split())
arr = [list(map(int, input().strip())) for _ in range(h)]
dp = [[0 for _ in range(w)] for _ in range(h)]

for c in range(w-1):
    for r in range(h):
        dp[r][c+1] = max(dp[r][c+1], dp[r][c] + arr[r][c])
        if r:
            dp[r-1][c+1] = max(dp[r-1][c+1], dp[r][c] + arr[r][c])
        if r < h-1:
            dp[r+1][c+1] = max(dp[r+1][c+1], dp[r][c] + arr[r][c])

ans = 0
for r in range(h):
    ans = max(ans, dp[r][-1])
print(ans)