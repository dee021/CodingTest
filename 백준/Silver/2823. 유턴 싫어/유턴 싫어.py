import sys
from collections import deque
input = sys.stdin.readline

def sol(r, c):
    arr[r][c] = 1
    q = deque([[r, c]])
    while q:
        y, x = q.popleft()
        cnt = 0
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if 0 <= r < n and 0 <= c < m:
                if arr[r][c] != 'X':
                    cnt += 1
                if arr[r][c] == '.':
                    q.append([r, c])
                    arr[r][c] = arr[y][x] +1
        if cnt == 1:
            return 1
    return 0

dr = [[0,1], [0,-1], [1,0], [-1,0]]
n, m = map(int, input().split())
arr = [list(input().strip()) for _ in range(n)]

for i in range(n):
    for j in range(m):
        if arr[i][j] == '.':
            print(sol(i, j))
            exit(0)