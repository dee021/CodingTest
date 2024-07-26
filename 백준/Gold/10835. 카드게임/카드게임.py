import sys
input = sys.stdin.readline

n = int(input())
left = list(map(int, input().split()))
right = list(map(int, input().split()))
dp = [[0 for _ in range(n+1)] for _ in range(n+1)]

for l in range(n-1, -1, -1):
    for r in range(n-1, -1, -1):
        if right[r] < left[l]:
            dp[l][r] = max(dp[l+1][r+1], dp[l+1][r], dp[l][r+1] + right[r])
        else:
            dp[l][r] = max(dp[l+1][r+1], dp[l+1][r])
print(dp[0][0])