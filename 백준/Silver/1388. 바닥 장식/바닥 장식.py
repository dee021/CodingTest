from collections import deque

def sol(r, c):
    ptn = arr[r][c]
    dr = d[arr[r][c] == '|']
    q = deque([[r, c]])
    while q:
        y, x = q.popleft()
        for dx, dy in dr:
            c, r = x + dx, y + dy
            if 0 <= c < m and 0 <= r < n and arr[r][c] == ptn:
                arr[r][c] = 0
                q.append([r, c])
    return 1
d = [[[1,0], [-1,0]], [[0,1], [0,-1]]]
n, m = map(int, input().split())
arr = [list(input()) for _ in range(n)]
ans = 0
for r in range(n):
    for c in range(m):
        if arr[r][c]:
            ans += sol(r, c)
print(ans)