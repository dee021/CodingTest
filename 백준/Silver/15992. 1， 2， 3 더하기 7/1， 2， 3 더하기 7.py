import sys
input = sys.stdin.readline

M = 1_000_000_009
dp = [[0 for _ in range(n+1)] for n in range(1001)]
dp[1][1] = dp[2][1] = dp[3][1] = 1

for n in range(1, 1001):
    for m in range(1, n+1):
        if not dp[n][m]: 
            continue
        for k in range(1, 4):
            if n+k > 1000:
                break
            dp[n+k][m+1] += dp[n][m]
            if dp[n+k][m+1] >= M:
                dp[n+k][m+1] %= M
    
for _ in range(int(input())):
    n, m = map(int, input().split())
    print(dp[n][m])
