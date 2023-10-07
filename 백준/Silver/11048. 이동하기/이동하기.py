import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [[0 for _ in range(m)] for _ in range(n)]
dp[0] = [sum(arr[0][:x+1]) for x in range(m)]

for r in range(1, n):
    for c in range(m):
        if c == 0:
            dp[r][0] = dp[r-1][0] + arr[r][0]
            continue
        dp[r][c] = max(dp[r-1][c], dp[r][c-1], dp[r-1][c-1]) + arr[r][c]

print(dp[n-1][m-1])