from collections import deque

def sol(r, c):
    q = deque([[r, c, 0]])
    while q:
        r, c, d = q.popleft()
        d += 1
        for i in range(8):
            x, y = c + dx[i], r + dy[i]
            if 0 <= x < m and 0 <= y < n and (not arr[y][x] or arr[y][x] > d):
                    arr[y][x] = d
                    q.append([y, x, d])

dy, dx = [1,1,1,-1,-1,-1,0,0], [0,1,-1,0,1,-1,1,-1]
n, m = map(int, input().split())
arr = [list(map(int, input().replace('1', '-1').split())) for _ in range(n)]
ans = 0
for r in range(n):
    for c in range(m):
        if arr[r][c] == -1:
            sol(r, c)
for r in range(n):
    ans = max(ans, *arr[r])
print(ans)