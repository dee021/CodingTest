n = int(input())
M = 9901
dp = [[0,0] for _ in range(n)]
dp[0] = [2,1] # [TF or FT, FF] (T:배치, F:배치x)

for i in range(n-1):
    dp[i+1] = [(dp[i][0]+dp[i][1]*2)%M, sum(dp[i])%M]
print(sum(dp[n-1])%M)