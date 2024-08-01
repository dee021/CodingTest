n = int(input())
arr = [input().strip().split() for _ in range(n)]
dp = [['' for _ in range(n)] for _ in range(n)]
dp[0][0] = arr[0][0]

for r in range(n):
    if r:
        dp[r][0] = dp[r-1][0] + arr[r][0]
    for c in range(n):
        if not r and c:
            dp[0][c] = dp[0][c-1] + arr[0][c]
        elif r and c:
            dp[r][c] = max(dp[r-1][c], dp[r][c-1]) + arr[r][c]
print(int(dp[n-1][n-1],2))