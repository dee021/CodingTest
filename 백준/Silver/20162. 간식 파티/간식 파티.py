import sys
input = sys.stdin.readline

n = int(input())
arr = [0] + [int(input()) for _ in range(n)]
dp = [0] + [0 for _ in range(n)]
ans = 0
for i in range(1, n+1):
    for j in range(i-1, -1, -1):
        if arr[i] > arr[j]:
            dp[i] = max(dp[i], dp[j] + arr[i])
    ans = max(ans, dp[i])
print(ans)