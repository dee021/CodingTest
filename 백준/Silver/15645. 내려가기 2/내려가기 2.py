import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
min_dp = [arr[0].copy(), [0,0,0]]
max_dp = [arr[0].copy(), [0,0,0]]
for r in range(1, n):
    for c in range(3):
        min_dp[r%2][c] = arr[r][c] + min(min_dp[r%2 ^ 1][max(0, c-1):min(3, c+2)])
        max_dp[r%2][c] = arr[r][c] + max(max_dp[r%2 ^ 1][max(0, c-1):min(3, c+2)])
print(max(max_dp[n%2 ^1]), min(min_dp[n%2 ^1]))
