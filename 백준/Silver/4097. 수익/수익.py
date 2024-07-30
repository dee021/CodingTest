import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if not n:
        break
    dp = [0 for _ in range(n)]
    dp[0] = int(input())
    ans = dp[0]
    for i in range(n-1):
        p = int(input())
        dp[i+1] = max(dp[i] + p, p)
        ans = max(ans, dp[i+1])
    print(ans)