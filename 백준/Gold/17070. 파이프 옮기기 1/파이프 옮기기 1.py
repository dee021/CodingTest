import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [[[0,0,0] for _ in range(n)] for _ in range(n)]
dp[0][1][0] = 1

for r in range(n):
    for c in range(n):
        if dp[r][c][0] and c+1 < n and arr[r][c+1] == 0:
            dp[r][c+1][0] += dp[r][c][0]
            if r+1 < n and arr[r+1][c+1] == arr[r+1][c] == 0:
                dp[r+1][c+1][2] += dp[r][c][0]
        if dp[r][c][1] and r+1 < n and arr[r+1][c] == 0:
            dp[r+1][c][1] += dp[r][c][1]
            if c+1 < n and arr[r+1][c+1] == arr[r][c+1] == 0:
                dp[r+1][c+1][2] += dp[r][c][1]
        if dp[r][c][2]:
            if c+1 < n and arr[r][c+1] == 0:
                dp[r][c+1][0] += dp[r][c][2]
            if r+1 < n and arr[r+1][c] == 0:
                dp[r+1][c][1] += dp[r][c][2]
            if c+1 < n and r+1 < n and arr[r+1][c+1] == arr[r][c+1] == arr[r+1][c] == 0:
                dp[r+1][c+1][2] += dp[r][c][2]

print(sum(dp[n-1][n-1]))