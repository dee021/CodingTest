import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
dp = [float('inf') for _ in range(n)]
dp[0] = 0

for end in range(1, n):
    for start in range(end):
        dis = (end - start) * (1 + abs(arr[start] - arr[end]))
        dp[end] = min(dp[end], max(dp[start], dis))
print(dp[-1])