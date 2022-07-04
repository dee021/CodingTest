import sys
from collections import deque

n = int(sys.stdin.readline())
t = deque(0 for _ in range(n))
dp = deque([0 for _ in range(i+1)] for i in range(n))
t[0] = dp[0] = int(input())

for i in range(1,n,1):
    t[i] = list(map(int,sys.stdin.readline().split()))
    if i == 1:
        dp[1][0] = dp[0] + t[1][0]
        dp[1][1] = dp[0] + t[1][1]
    else:
        for j in range(0,i+1,1):
            if j == 0:
                dp[i][j] = dp[i-1][0] + t[i][0]
            elif j == i:
                dp[i][j] = dp[i-1][i-1] + t[i][i]
            else:
                dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + t[i][j]
print(max(dp[n-1])) if n > 1 else print(dp[0])