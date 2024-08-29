def solution(triangle):
    n = len(triangle)
    dp = [[0] * i for i in range(1,n+1)]
    dp[0] = triangle[0]
    
    for r in range(1, n):
        dp[r][0] = dp[r-1][0] + triangle[r][0]
        for c in range(1, r):
            dp[r][c] = max(dp[r-1][c-1], dp[r-1][c]) + triangle[r][c]
        dp[r][r] = dp[r-1][r-1] + triangle[r][r]
    
    return max(dp[-1])