from collections import deque
import sys
input = sys.stdin.readline

def sol(x, y):
    q = deque([[x, y, 0]])
    while q:
        x, y, cnt = q.popleft()
        for dx, dy in dr:
            c, r = x + dx, y + dy
            if 0 < c <= n and 0 < r <= n and visited[r][c] <= 0:
                if visited[r][c]:
                    ans[-visited[r][c]-1] = cnt +1
                    if all(ans):
                        return
                visited[r][c] = cnt +1
                q.append([c, r, cnt +1])

dr = ((-2,-1), (-2,1), (-1,-2), (-1,2), (1,-2), (1,2), (2,-1), (2,1))
n, m = map(int, input().split())
visited = [[0 for _ in range(n+1)] for _ in range(n+1)]
cur = list(map(int, input().split()))
ans = [0 for _ in range(m)]
for i in range(m):
    x, y = map(int, input().split())
    visited[y][x] = -i-1
sol(*cur)
print(*ans)