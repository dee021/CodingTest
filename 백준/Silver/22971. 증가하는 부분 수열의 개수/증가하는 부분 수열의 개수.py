import sys
input = sys.stdin.readline

M = 998_244_353
n = int(input())
arr = list(map(int, input().split()))
dp = [1 for _ in range(n)]

for i in range(1, n):
    for j in range(i):
        if arr[i] > arr[j]:
            dp[i] += dp[j]
        dp[i] %= M
print(*dp)