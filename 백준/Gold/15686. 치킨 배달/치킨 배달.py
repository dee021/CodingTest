import sys
input = sys.stdin.readline

def cal(lst, idx):
    for i in range(len(lst)):
        lst[i] = min(lst[i], dp[i][idx])
    return lst

def sol(idx, cnt, dist):
    global ans
    ans = min(ans, sum(dist))
    
    if cnt >= m or idx >= len(dp[0]):
        return
    
    sol(idx+1, cnt, dist.copy())
    sol(idx+1, cnt+1, cal(dist, idx))

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
d = {1:[], 2:[]}
ans = float('inf')
for r in range(n):
    for c in range(n):
        if arr[r][c]:
            d[arr[r][c]].append([r, c])

dp = [[0 for _ in range(len(d[2]))] for _ in range(len(d[1]))]
# dp[i][j] = i집과 j치킨집의 거리

for i, (r, c) in enumerate(d[1]):
    for j, (x, y) in enumerate(d[2]):
        dp[i][j] = abs(r-x) + abs(c-y)
sol(0, 0, [float('inf') for _ in range(len(dp))])
print(ans)