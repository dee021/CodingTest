import sys
input = sys.stdin.readline

M = 1000000009
B = 100001
dp = [[0,0,0,0],[1,0,0,1],[0,1,0,1],[1,1,1,3]] + [[0,0,0,0] for _ in range(B-4)]

for i in range(4, B):
    for j in range(1, 4):
        dp[i][j-1] = (dp[i-j][3] - dp[i-j][j-1]) % M
    dp[i][3] = sum(dp[i]) % M

for _ in range(int(input())):
    print(dp[int(input())][3])