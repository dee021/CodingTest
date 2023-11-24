import sys
input = sys.stdin.readline
from collections import deque

def sol(r, c):
    global ans
    ans += 1
    q = deque([[r, c]])
    arr[r][c] = '.'
    while q:
        y, x = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < h and 0 <= c < w and arr[r][c] == '#':
                q.append([r, c])
                arr[r][c] = '.'

dy, dx = [0,0,1,-1], [1,-1,0,0]
for _ in range(int(input())):
    ans = 0
    h, w = map(int, input().split())
    arr = [list(input().strip()) for _ in range(h)]
    for r in range(h):
        for c in range(w):
            if arr[r][c] == '#':
                sol(r, c)
    print(ans)