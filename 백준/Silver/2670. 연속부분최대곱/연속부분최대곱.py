import sys
input = sys.stdin.readline

n = int(input())
arr = list([float(input()) for _ in range(n)])
dp = [0 for _ in range(n)]
dp[0] = arr[0]

if n > 1:
    dp[1] = max(arr[1], arr[0]*arr[1])

for i in range(n-2):
    dp[i+2] = max(dp[i+1]*arr[i+2], dp[i]*arr[i+1]*arr[i+2], arr[i+2])
print('%0.3f' %max(dp))
