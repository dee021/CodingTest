import sys
input = sys.stdin.readline

cnt = min(2, int(float(input())//0.99))+1
n = int(input())
dp = [[0]*cnt for _ in range(n+1)]
solved, days = 0, 0
for i, p in enumerate(map(int, input().split()), start=1):
    solved = max(solved, p)
    for j in range(cnt):
        if p:
            dp[i][j] = dp[i-1][j] +1
        elif j:
            dp[i][j] = dp[i-1][j-1] +1
    days = max(days, max(dp[i]))
print(days, solved, sep= '\n')