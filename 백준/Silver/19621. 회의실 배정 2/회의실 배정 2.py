import sys
input = sys.stdin.readline

n = int(input())
s, e, c = map(int, input().split())
dp = [0 for _ in range(n)]
dp[0] = c
maxValue = 0
for i in range(1, n):
    s, e, c = map(int, input().split())
    dp[i] = max(dp[i-1], maxValue + c)
    maxValue = max(maxValue, dp[i-1])
print(dp[-1])