import sys
from collections import deque

n = int(sys.stdin.readline())

num = list(map(int, sys.stdin.readline().split()))

dp = deque([0 for x in range(n)])
dp[0] = num[0]

for i in range(1,n,1):
    dp[i] = max(dp[i-1] + num[i],num[i])

print(max(dp))