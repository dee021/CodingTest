n = int(input())
arr = [0] + list(map(int, input().split()))
dp = [0] + [float('inf') for _ in range(n)]

for i in range(1,n+1):
    dp[i] = arr[i]
    for j in range(i):
        dp[i] = min(dp[i], dp[i-j] + arr[j])
print(dp[n])