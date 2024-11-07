import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    if n == 1:
        return 0
    arr = list(map(int, input().split()))
    dp = [[0,0] for _ in range(n)]
    dp[0][1] = arr[0]
    dp[1] = [arr[0], arr[1]]
    for i in range(2, n):
        dp[i][0] = dp[i-1][1]
        dp[i][1] = min(dp[i-2][1], dp[i-1][1]) + arr[i]
    return min(dp[-1])

print(sol())