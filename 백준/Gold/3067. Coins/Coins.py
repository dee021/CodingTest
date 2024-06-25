import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    coins = [0] + list(map(int, input().split()))
    m = int(input())
    dp = [[0 for _ in range(m+1)] for _ in range(n+1)]
    dp[0][0] = 1
    for c in range(1,n+1):
        for k in range(m+1):
            dp[c][k] = dp[c-1][k]
            
            if k >= coins[c]:
                dp[c][k] += dp[c][k - coins[c]]
    print(dp[n][m])