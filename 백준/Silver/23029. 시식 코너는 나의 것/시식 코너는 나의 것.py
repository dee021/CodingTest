import sys
input = sys.stdin.readline

n = int(input())
arr =[0] + [int(input()) for _ in range(n)]
dp = [0 for _ in range(n+1)]
dp[1] = arr[1]
mv = 0
for i in range(2, n+1):
    dp[i] = max(dp[i-1], mv + arr[i-1] + arr[i]//2, dp[i-2] + arr[i])
    mv = max(mv, dp[i-2])

print(dp[n])