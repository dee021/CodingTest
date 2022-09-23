h, y = map(int, input().split())
dp = [0 for _ in range(y+1)]
dp[0] = h # 0년

for i in range(1,y+1):
    dp[i] = int(dp[i-1] * 1.05) # A 방식
    if i >= 3:
        dp[i] = max(dp[i], int(dp[i-3]*1.2)) # max(A 방식, B 방식)
    if i >= 5:
        dp[i] = max(dp[i], int(dp[i-5]*1.35)) # max(A or B, C)
print(dp[y])