import sys
input = sys.stdin.readline
from collections import deque

def sol(k, j, i):
    q = deque([[k, j, i]])
    while q:
        z, y, x = q.popleft()
        day = tomato[z][y][x]
        for i in range(6):
            c, r, f = x+dx[i], y+dy[i], z+dz[i]
            if 0 <= c < m and 0 <= r < n and 0 <= f < h and (not tomato[f][r][c] or tomato[f][r][c] > day+1):
                tomato[f][r][c] = day + 1
                q.append([f, r, c])
    return 

dx, dy, dz = [1,-1,0,0,0,0], [0,0,1,-1,0,0], [0,0,0,0,1,-1]
m, n, h = map(int, input().split())
tomato = [[list(map(int ,input().split())) for _ in range(n)]for _ in range(h)]
ans = 0
for k in range(h):
    for j in range(n):
        for i in range(m):
            if tomato[k][j][i] == 1:
                sol(k, j, i)
for k in range(h):
    for j in range(n):
        if not all(tomato[k][j]):
            print(-1)
            break
        if ans < max(tomato[k][j]):
            ans = max(tomato[k][j])
    else:
        continue
    break
else:
    print(ans -1 if ans > 1  else 0)