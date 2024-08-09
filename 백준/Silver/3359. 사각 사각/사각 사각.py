import sys
input = sys.stdin.readline

n = int(input())
rect = [list(map(int, input().split())) for _ in range(n)]
dp = [[0, 0] for _ in range(n)] # dp[i][j] : rect[i][j] 가 바닥에 닿을 때의 최댓값
dp[0] = rect[0]

for i in range(n-1):
    for j in range(2):
        dp[i+1][j] = max(dp[i][0] + abs(rect[i][1] - rect[i+1][j^1]), dp[i][1] + abs(rect[i][0] - rect[i+1][j^1])) + rect[i+1][j]
print(max(dp[-1]))