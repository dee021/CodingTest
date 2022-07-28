import sys
n = int(input()) # 1 ≤ n ≤ 10,000

dp = [0 for _ in range(n)]
l = list(int(sys.stdin.readline()) for _ in range(n))

dp[0] = l[0]
if n > 1:
    dp[1] = dp[0] + l[1]
if n > 2:
    dp[2] = max(dp[1], dp[0] + l[2], l[1] + l[2])

for i in range(n-3):
    dp[i+3] = max(dp[i] + l[i+2], dp[i+1]) + l[i+3] # (i+3)번째 잔을 마시는 경우
    dp[i+3] = max(dp[i+3], dp[i+2]) # 마시는 경우와 마시지 않는 경우를 비교

print(dp[n-1])