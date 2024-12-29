import sys
input = sys.stdin.readline

n = int(input())
dp = [[0]*5 for _ in range(n)]
maxV, g = 0,0
for i in range(n):
    for x in map(int, input().split()):
        dp[i][x-1] = dp[i-1][x-1] + 1
        if dp[i][x-1] > maxV:
            maxV = dp[i][x-1]
            g = x
        elif dp[i][x-1] == maxV:
            g = min(g, x)
    
print(maxV, g)