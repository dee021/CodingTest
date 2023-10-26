import sys
input = sys.stdin.readline
from collections import deque

def trash(r, c):
    size = 0
    q = deque([[c, r]])
    while q:
        size += 1
        x, y = q.popleft()
        for i in range(4):
            c, r = x + dx[i], y + dy[i]
            if 0 <= r < n and 0 <= c < m and arr[r][c]:
                arr[r][c] = 0
                q.append([c, r])
    return size

dx, dy = [1,-1,0,0], [0,0,1,-1]
n, m, k = map(int, input().split())
arr = [[0 for _ in range(m)] for _ in range(n)]
for _ in range(k):
    r, c = map(int, input().split())
    arr[r-1][c-1] = 1

ans = 0
for r in range(n):
    for c in range(m):
        if arr[r][c]:
            arr[r][c] = 0
            t = trash(r, c)
            ans = max(t, ans)
print(ans)