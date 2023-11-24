import sys
input = sys.stdin.readline
from collections import deque

def sol(y, x):
    d = deque([arr[y][x]])
    r, c = y, x
    if r + 1 < n - x:
        r += 1
        i = 0
    else:
        c += 1
        i = 1
    while r != y or c != x :
        d.append(arr[r][c])
        if not (x <= r + dy[i] < n - x) or not (x <= c + dx[i] < m - x):
            i = (i + 1) % 4
        r += dy[i]; c += dx[i]

    d.rotate(rt%len(d))

    i, r, c = 1, x, x
    while d:
        ans[r][c] = d.pop()
        if not (x <= r + dy[i] < n - x) or not (x <= c + dx[i] < m - x):
            i = (i+3)%4
        r += dy[i]; c += dx[i]

dy, dx = [1,0,-1,0], [0,1,0,-1]
n, m, rt = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = [[0 for _ in range(m)] for _ in range(n)]

for i in range(min(n, m)//2):
    sol(i+1, i)
for i in range(n):
    print(*ans[i])