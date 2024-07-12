import sys
input = sys.stdin.readline

dp = [0 for _ in range(100001)]
dp[0] = dp[1] = 1
dp[2] = dp[3] = 2

for i in range(4, 100001):
    for j in [2, 4, 6]:
        dp[i] += dp[i-j]
    dp[i] %= 1000000009

ans = ''
for _ in range(int(input())):
    ans += str(dp[int(input())])+'\n'
print(ans)