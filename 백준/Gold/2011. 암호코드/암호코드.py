def dp():
    M = 1000000
    s = ' ' + input().strip()
    dp = [0 for _ in range(len(s))]
    if s[1] == '0':
        return 0
    dp[0] = dp[1] = 1
    for i in range(2, len(s)):
        if s[i] == '0':
            if s[i-1] not in '12':
                return 0
            dp[i] = dp[i-2]
        elif s[i-1] not in '12':
            dp[i] = dp[i-1]
        elif int(s[i-1:i+1]) > 26:
            dp[i] = dp[i-1]
        else:
            dp[i] = (dp[i-1] + dp[i-2])%1000000
    return dp[-1]

print(dp())