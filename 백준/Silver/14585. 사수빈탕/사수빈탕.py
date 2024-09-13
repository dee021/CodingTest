def sol():
    ans = 0
    for r in range(301):
        if r:
            dp[r][0] += dp[r-1][0]
        for c in range(301):
            if not r and c:
                dp[0][c] += dp[0][c-1]
            elif r and c:
                dp[r][c] += max(dp[r-1][c], dp[r][c-1])
                ans = max(ans, dp[r][c])
    return ans

n, m = map(int, input().split())
dp = [[0 for _ in range(301)] for i in range(301)]
ans = 0

for _ in range(n):
    x, y = map(int, input().split())
    if x <= 300 and y <= 300:
        dp[y][x] = max(0, m - x - y)

print(sol())