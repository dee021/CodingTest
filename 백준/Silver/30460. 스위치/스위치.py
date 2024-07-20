import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))[::-1]

dp = [0 for _ in range(n)]
dp[0] = max(arr[0], arr[0]*2)
dp[1] = max(arr[1] + dp[0], sum(arr[:2])*2)
dp[2] = max(dp[1] + arr[2], sum(arr[:3])*2)
for i in range(3, n):
    dp[i] = max(dp[i-3] + sum(arr[i-2:i+1])*2, dp[i-2] + sum(arr[i-1:i+1]), dp[i-1] + arr[i])
print(dp[n-1])