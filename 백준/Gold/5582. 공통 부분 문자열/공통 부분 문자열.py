s = input().strip()
t = input().strip()

dp = [[0 for _ in range(len(s))] for _ in range(len(t))]
ans = 0

for r in range(len(t)):
    for c in range(len(s)):
        if t[r] == s[c]:
            if c:
                dp[r][c] = dp[r-1][c-1] +1
            else:
                dp[r][c] = 1
            ans = max(ans, dp[r][c])
print(ans)