M = 1000000000
n, k = map(int, input().split())
dp = [[x+1 for x in range(k)]] + [[0 for _ in range(k)] for _ in range(n-1)]

for r in range(1, n):
    dp[r][0] = 1
    for c in range(1,k):
        dp[r][c] = (dp[r-1][c] + dp[r][c-1]) % M
        
print(dp[n-1][k-1])