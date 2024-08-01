import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    wc = [list(map(float, input().split())) for _ in range(n)]
    dp = [1 for _ in range(n)]
    ans = 1
    for i in range(1, n):
        for j in range(i-1, -1, -1):
            if wc[i][0] > wc[j][0] and wc[i][1] < wc[j][1]:
                dp[i] = max(dp[i], dp[j]+1)
        ans = max(ans, dp[i])
    print(ans)