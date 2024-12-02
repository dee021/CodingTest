import sys
input = sys.stdin.readline

ans = [0 for _ in range(31)]
dp = [[0 for _ in range(n)] for n in range(31)]
ans[1], dp[1] = 1, [1]

for i in range(2, 31):
    tmp = 0
    for j in range(i-1):
        tmp += dp[i-1][j]
        dp[i][j] = tmp
    dp[i][-1] = tmp
    ans[i] = sum(dp[i])

while True:
    n = int(input())
    if not n:
        break
    print(ans[n])