import sys
input = sys.stdin.readline

n = int(input())
arr = sorted([list(map(int, input().split())) for _ in range(n)])
dp = [0 for _ in range(n)]
for i in range(n):
    dp[i] = 1
    for j in range(i):
        if arr[j][1] < arr[i][1]:
            dp[i] = max(dp[i], dp[j]+1)

print(n - max(dp))