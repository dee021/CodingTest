h, w = map(int, input().split())
item = [list(map(int, input().split())) for _ in range(h)]
dp = [[float('inf') for _ in range(w)] for _ in range(h)]
dp[0][0] = 0
for y in range(h):
    for x in range(w):
        dis = item[y][x]
        for d in range(1, dis+1):
            if 0 <= y + d < h:
                dp[y + d][x] = min(dp[y + d][x], dp[y][x]+1)
            if 0 <= x + d < w:
                dp[y][x + d] = min(dp[y][x + d], dp[y][x]+1)
print(dp[h-1][w-1])