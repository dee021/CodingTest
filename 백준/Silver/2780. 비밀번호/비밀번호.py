import sys
input = sys.stdin.readline

M = 1234567
edge = {1:[2,4], 2:[1,3,5], 3:[2,6], 4:[1,5,7], 5:[2,4,6,8], 6:[3,5,9], 7:[4,8,0], 8:[5,7,9], 9:[6,8], 0:[7]}
dp = [[1 for _ in range(10)]] + [[0 for _ in range(10)] for _ in range(999)]
for i in range(999):
    for node in range(10):
        for post in edge[node]:
            dp[i+1][node] += dp[i][post]
            dp[i+1][node] %= M

for _ in range(int(input())):
    print(sum(dp[int(input())-1])%M)