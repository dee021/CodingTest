import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(2)]
    dp = [[0,0] for _ in range(n)]
    dp[0] = [arr[0][0], arr[1][0]]
    if n>1:
        dp[1] = [dp[0][1]+arr[0][1], dp[0][0]+arr[1][1]]
    for i in range(n-2):
        dp[i+2][0] = max(max(dp[i]), dp[i+1][1]) + arr[0][i+2]
        dp[i+2][1] = max(max(dp[i]), dp[i+1][0]) + arr[1][i+2]
    print(max(dp[-1]))