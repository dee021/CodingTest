from collections import deque
import sys
import copy
input = sys.stdin.readline

def sol(r, c, h):
    q = deque([[r, c]])
    if arr[r][c] == h:
         origin[r][c] = 0
    arr[r][c] = 0
    while q:
        r, c = q.popleft()
        for i in range(4):
            x, y = c+dx[i], r+dy[i]
            if 0 <= x < n and 0 <= y < n and arr[y][x]:
                if arr[y][x] == h:
                    origin[y][x] = 0
                arr[y][x] = 0
                q.append([y, x])

dy, dx = [1,-1,0,0], [0,0,1,-1]
n = int(input())
origin = [list(map(int, input().split())) for _ in range(n)]
height = set()
for r in range(n):
    height.update(set(origin[r]))

ans = 1
for h in sorted(height):
    cnt = 0
    arr = copy.deepcopy(origin)
    for r in range(n):
        for c in range(n):
            if arr[r][c]:
                cnt += 1
                sol(r, c, h)
    ans = max(ans, cnt)
print(ans)