import sys
input = sys.stdin.readline
from collections import deque

dx, dy = [1, -1, 0, 0], [0, 0, 1, -1]

def sol(n, m, r, c):
    q = deque([[r, c]])    
    while q:
        r, c = q.popleft()
        for i in range(4):
            x, y = r+dx[i], c+dy[i]
            if 0 <= x < n and 0 <= y < m and arr[x][y] == 1 and ans[x][y] == 0:
                ans[x][y] += ans[r][c] +1
                q.append([x, y])
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 1 and ans[i][j] == 0:
                ans[i][j] = -1

n, m = map(int, input().split())
ans = [[0]*m for _ in range(n)]
arr = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
    for j in range(m):
        if arr[i][j] == 2:
            sol(n, m, i, j)
            for p in range(n):
                print(*ans[p])
            exit(0)