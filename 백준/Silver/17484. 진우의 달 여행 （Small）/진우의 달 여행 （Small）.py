import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [[[float('inf'), float('inf'), float('inf')] for _ in range(m)] for _ in range(n)]
ans = float('inf')

for r in range(n):
    for c in range(m):
        for i, d in enumerate([-1, 0, 1]):
            if not r:
                dp[r][c][i] = arr[r][c]
                continue
            if 0 <= c+d < m:
                if i == 0:
                    tmp = min(dp[r-1][c+d][1:])
                elif i == 1:
                    tmp = min(dp[r-1][c+d][0], dp[r-1][c+d][2])
                else:
                    tmp = min(dp[r-1][c+d][:2])
                dp[r][c][i] = tmp + arr[r][c]
for c in range(m):
    ans = min(ans, min(dp[n-1][c]))
print(ans)