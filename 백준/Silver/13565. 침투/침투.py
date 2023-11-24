import sys
input = sys.stdin.readline
from collections import deque

def sol(r, c):
    q = deque([[r, c]])
    arr[r][c] = 2
    while q:
        y, x = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < m and 0 <= c < n and arr[r][c] == 0:
                if r == m-1:
                    return 1
                q.append([r, c])
                arr[r][c] = 2
    return 0

dy, dx = [0,0,1,-1], [1,-1,0,0]
m, n = map(int, input().split())
arr = [list(map(int, input().strip())) for _ in range(m)]

for i in range(n):
    if arr[0][i] == 0:
        res = sol(0, i)
        if res:
            print('YES')
            break
else:
    print('NO')