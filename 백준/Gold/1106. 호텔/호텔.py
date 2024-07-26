import sys
input = sys.stdin.readline

c, n = map(int, input().split())
city = []
day = 0
for _ in range(n):
    m, p = map(int, input().split())
    city.append([p, m])
    day = max(day, p)
city.sort()

dp = [float('inf') for _ in range(c+1+day)]
dp[0] = 0
ans = float('inf')
for i in range(c+1+day):
    for p, m in city:
        if i >= p:
            dp[i] = min(dp[i], dp[i-p] + m)
        else:
            break
    if i >= c and dp[i] != float('inf'):
        ans = min(ans, dp[i])
print(ans)