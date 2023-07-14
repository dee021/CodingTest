import sys
input = sys.stdin.readline
from collections import deque

dx, dy = [list(x) for x in zip(*[(-1,0), (1,0), (0,-1), (0,1)])]
def sol(s):
    ans = 0
    while s:
        x, y = s.popleft()
        for i in range(4):
            r = x+dx[i]; c = y+dy[i]
            if 0 <= r < n and 0 <= c < m and arr[r][c] == 0:
                arr[r][c] = arr[x][y] +1
                s.append([r, c])

m, n = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
s = deque()
for r in range(n):
    for c in range(m):
        if arr[r][c] == 1:
            s.append([r, c])
sol(s)
ans = 0
for r in range(n):
    for c in range(m):
        if arr[r][c] == 0:
            print(-1)
            exit(0)
    ans = max(ans, max(arr[r]))
print(ans-1)