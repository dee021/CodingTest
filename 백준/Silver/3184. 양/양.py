from collections import deque
import sys
input = sys.stdin.readline

def sol(r, c):
    global s, w
    cnt = [0,0] # s, w
    if arr[r][c].isalpha():
        cnt[arr[r][c] == 'v'] += 1
    q = deque([[r, c]])
    arr[r][c] = '#'
    while q:
        r, c = q.popleft()
        for i in range(4):
            x, y = c + dx[i], r + dy[i]
            if 0 <= x < m and 0 <= y < n and arr[y][x] != '#':
                if arr[y][x].isalpha():
                    cnt[arr[y][x] == 'v'] += 1
                arr[y][x] = '#'
                q.append([y, x])
    if cnt[0] > cnt[1]:
        s += cnt[0]
    else:
        w += cnt[1]

dy, dx = [1,-1,0,0], [0,0,1,-1]
s, w = 0,0
n, m = map(int, input().split())
arr = [list(input().strip()) for _ in range(n)]

for i in range(n):
    for j in range(m):
        if arr[i][j] != '#':
            sol(i, j)
print(s, w)