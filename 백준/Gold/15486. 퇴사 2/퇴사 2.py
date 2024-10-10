import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
dp = [0 for _ in range(n+1)]
ans = 0
for d in range(n-1, -1, -1):
    if d + arr[d][0] > n:
        dp[d] = dp[d+1]
        continue
    dp[d] = max(dp[d+arr[d][0]] + arr[d][1], dp[d+1])
    ans = max(ans, dp[d])
print(ans)