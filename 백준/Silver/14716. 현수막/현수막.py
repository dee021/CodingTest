from collections import deque
import sys
input = sys.stdin.readline

def sol(r, c):
    q = deque([[r, c]])
    arr[r][c] = 0
    while q:
        r, c = q.popleft()
        for i in range(8):
            x, y = c + dx[i], r + dy[i]
            if 0 <= x < n and 0 <= y < m and arr[y][x]:
                arr[y][x] = 0
                q.append([y, x])

dy, dx = [1,1,1,-1,-1,-1,0,0], [0,1,-1,0,1,-1,1,-1]
m, n = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(m)]
ans = 0
for r in range(m):
    for c in range(n):
        if arr[r][c]:
            ans += 1
            sol(r, c)
print(ans)