from collections import deque

def sol(r, c):
    res = 1
    q = deque([[r,c]])
    arr[r][c] = 0
    while q:
        y, x = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < m and 0 <= c < n and arr[r][c]:
                arr[r][c] = 0
                q.append([r, c])
                res += 1
    return res

dx, dy = [1,-1,0,0],[0,0,1,-1]
m, n, k = map(int, input().split())
arr = [[1 for _ in range(n)] for _ in range(m)]
for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for y in range(y1, y2):
        for x in range(x1, x2):
            arr[y][x] = 0
cnt = 0; a = []
for r in range(m):
    for c in range(n):
        if arr[r][c]:
            cnt += 1
            a.append(sol(r, c))
print(cnt)
print(*sorted(a))