from collections import deque

def sol(r, c):
    global w, b
    p = 1
    color, war[r][c] = war[r][c], 0
    q = deque([[r, c]])
    while q:
        y, x = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= c < n and 0 <= r < m and war[r][c] == color:
                war[r][c] = 0
                q.append([r, c])
                p += 1
    if color == 'W':
        w += p**2
    else:
        b += p**2

dx, dy = [0,0,1,-1], [1,-1,0,0]
w, b = 0,0
n, m = map(int, input().split())
war = [list(input()) for _ in range(m)]
for r in range(m):
    for c in range(n):
        if war[r][c]:
            sol(r, c)
print(w, b)