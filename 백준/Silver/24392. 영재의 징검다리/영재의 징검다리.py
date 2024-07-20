import sys
input = sys.stdin.readline

M = 1000000007

n, m = map(int, input().split())
bridge = [list(map(int, input().split())) for _ in range(n)]
dp = [bridge[0]] + [[0 for _ in range(m)]]

for r in range(1, n):
    for c in range(m):
        if bridge[r][c]:
            dp[r%2][c] = dp[(r%2)^1][c]
            if c:
                dp[r%2][c] += dp[(r%2)^1][c-1]
            if c < m-1:
                dp[r%2][c] += dp[(r%2)^1][c+1]
            dp[r%2][c] %= M
        else:
            dp[r%2][c] = 0
print(sum(dp[(n-1)%2])%M)