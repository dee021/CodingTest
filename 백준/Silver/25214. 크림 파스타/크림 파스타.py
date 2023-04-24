n = int(input())
arr = list(map(int, input().split()))
dp = [0 for _ in range(n)]
minv = arr[0]

for i in range(1, n):
    minv = min(minv, arr[i-1])
    dp[i] = max(dp[i-1], arr[i]-minv)
print(*dp)