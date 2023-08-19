from collections import deque

def sol(lst, name, r, c):
    if name == 'b' and color[r][c] in ['R', 'G']:
        cl = ['R', 'G']
    else:
        cl = [color[r][c]]
    s = deque([[r, c]])
    while s:
        x, y = s.popleft()
        for i in range(4):
            r, c = x+dx[i], y+dy[i]
            if 0 <= r < n and 0 <= c < n and color[r][c] in cl and lst[r][c]:
                s.append([r, c])
                lst[r][c] = False
    return 1

dx, dy = [1,-1,0,0], [0,0,1,-1]
n = int(input())
rgb = [[True for _ in range(n)] for _ in range(n)]
b = [[True for _ in range(n)] for _ in range(n)]
color = [input() for _ in range(n)]
ans = [0,0]
for i in range(n):
    for j in range(n):
        if rgb[i][j]:
            ans[0] += sol(rgb, 'rgb', i, j)
        if b[i][j]:
            ans[1] += sol(b, 'b', i, j)
print(*ans)