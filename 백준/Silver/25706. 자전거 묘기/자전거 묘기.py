n = int(input())
hs = list(map(int, input().split()))
dp = [0 for _ in range(n)]
n -= 1
dp[n] = 1
i = n-1

while i >= 0:
    if hs[i]:
        if i + hs[i] + 1 > n:
            dp[i] = 1
        else:
            dp[i] = dp[min(i+hs[i]+1, n)] +1
    else:
        dp[i] = dp[i+1] + 1
    i -= 1
print(*dp)