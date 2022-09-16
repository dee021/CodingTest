# t(n) = sigma{t(x) + t(n-1-x)}, x : [0, n-1]
dp = [0 for _ in range(int(input())+1)]
dp[0] = 1

for i in range(len(dp)-1):
    for j in range(i+1):
        dp[i+1] += dp[j] * dp[i-j]
print(dp[-1])