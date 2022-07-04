import sys
from collections import deque

n = int(sys.stdin.readline())
num = list(map(int, sys.stdin.readline().split()))

dp = deque(0 for _ in range(n))
dp[0] = 1

for i in range(1,n,1):
    dp[i] = 1
    for j in range(i):
        if num[i] > num[j]:
            dp[i] = max(dp[j]+1,dp[i])

print(max(dp))