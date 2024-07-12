n = int(input())
dp = [0 for _ in range(n)]
for i in range(n):
    for j in [1, 3, 4]:
        if i >= j and dp[i-j] == 0:
            dp[i] = 1
            break
print(dp[n-1] and 'SK' or 'CY')