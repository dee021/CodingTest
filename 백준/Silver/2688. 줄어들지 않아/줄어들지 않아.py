dp = [[0 for _ in range(10)] for _ in range(64)]
dp[0] = [1 for _ in range(10)]
# dp[i][j] : i자리 수 중 j로 시작하는 줄지 않는 수

for i in range(1,64):
    t = s = sum(dp[i-1])
    dp[i][0] = t
    for j in range(9):
        t -= dp[i-1][j]
        dp[i][j+1] = t
    dp[i-1] = s
dp[-1] = sum(dp[-1])
for _ in range(int(input())):
    print(dp[int(input())-1])