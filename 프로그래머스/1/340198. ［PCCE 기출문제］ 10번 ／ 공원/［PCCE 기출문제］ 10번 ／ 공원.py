def solution(mats, park):
    w, h = len(park[0]), len(park)
    dp = [[0 if park[0][x] != "-1" else 1 for x in range(w)]] + [[0 for _ in range(w)] for _ in range(h-1)]
    big = max(dp[0])
    for r in range(1, h):
        for c in range(w):
            if not c and park[r][0] == "-1":
                dp[r][0] = 1
            if c and park[r][c] == "-1":
                dp[r][c] = min(dp[r-1][c], dp[r][c-1], dp[r-1][c-1]) +1
            big = max(big, dp[r][c])
    answer = -1
    for l in mats:
        if l <= big:
            answer = max(answer, l)
    return answer