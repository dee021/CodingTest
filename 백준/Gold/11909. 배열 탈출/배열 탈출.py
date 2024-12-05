import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [[0 for _ in range(n)] for _ in range(n)]
for r in range(n):
    for c in range(n):
        if not r and c:
            dp[r][c] = dp[r][c-1] + max(arr[r][c] - arr[r][c-1] +1, 0)
        elif r and not c:
            dp[r][c] = dp[r-1][c] + max(arr[r][c] - arr[r-1][c] +1, 0)
        elif r and c:
            dp[r][c] = min(dp[r][c-1] + max(arr[r][c] - arr[r][c-1] +1, 0), dp[r-1][c] + max(arr[r][c] - arr[r-1][c] +1, 0))
print(dp[n-1][n-1])