import sys
input = sys.stdin.readline

n = int(input())
arr =list(map(int, input().split())) + [0]
dp = [0 for _ in range(n+1)]
ans = 0
for i in range(n, -1, -1):
    for j in range(i, n+1):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + arr[i])
    ans = max(ans, dp[i])
print(ans)