import sys
from collections import deque

n = int(sys.stdin.readline())
color = list(map(int, sys.stdin.readline().split()))
dp = deque([0,0,0] for _ in range(n))
dp[0] = color

for i in range(1,n):
    color = list(map(int, sys.stdin.readline().split()))
    dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + color[0]
    dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + color[1]
    dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + color[2]

print(min(dp[n-1]))

