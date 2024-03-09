n, k = map(int, input().split())
arr = filter(lambda x: x <= k, [int(input()) for _ in range(n)])
dp = [0 for _ in range(k+1)]
for c in arr:
    dp[c] += 1
    for i in range(c+1, k+1):
        dp[i] = dp[i] + dp[i-c]
print(dp[k])