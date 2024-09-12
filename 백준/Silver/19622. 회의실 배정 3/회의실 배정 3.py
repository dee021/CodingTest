import sys
input = sys.stdin.readline

n = int(input())
s, e, p = map(int, input().split())
dp = [0, p]
ans = dp[-1]

for d in range(2, n+1):
    s, e, p = map(int, input().split())
    dp.append(max(dp[d-2] + p, dp[d-1]))
    ans = max(ans, dp[-1])
print(ans)