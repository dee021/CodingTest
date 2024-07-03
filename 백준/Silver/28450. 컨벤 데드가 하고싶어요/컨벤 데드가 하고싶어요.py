import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
h = int(input())
dp = [[0 for _ in range(m)] for _ in range(n)]

for r in range(n):
    for c in range(m):
        if not r:
            dp[r][c] = dp[r][c-1] + arr[r][c]
            continue
        if not c:
            dp[r][c] = dp[r-1][c] + arr[r][c]
            continue
        dp[r][c] = min(dp[r-1][c], dp[r][c-1]) + arr[r][c]

print('YES\n%d' %dp[n-1][m-1] if dp[n-1][m-1] <= h else 'NO')