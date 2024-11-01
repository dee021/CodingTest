import sys
input = sys.stdin.readline

h, w = map(int, input().split())
arr = [list(map(int, input().strip())) for _ in range(h)]
dp = [[0 for _ in range(w-1)] for _ in range(h)]

for c in range(w-1):
    for r in range(h):
        if c == 0:
            dp[r][0] = arr[r][0]
        else:
            if r == 0:
                dp[r][c] = max(dp[r][c-1], dp[r+1][c-1]) + arr[r][c]
            elif r == h-1:
                dp[r][c] = max(dp[r][c-1], dp[r-1][c-1]) + arr[r][c]
            else:
                dp[r][c] = max(dp[r-1][c-1], dp[r][c-1], dp[r+1][c-1]) + arr[r][c]

ans = 0
for r in range(h):
    ans = max(ans, dp[r][-1])
print(ans)