import sys
input = sys.stdin.readline
from collections import deque

def sol(r, c):
    sec = 0
    ans = []
    if init[r][c]:
        return init[r][c]
    visited = [[0 for _ in range(n)] for _ in range(n)]
    visited[r][c] = 1
    q = deque([[r, c, 0]])
    while q and q[0][-1] < s:
        y, x, dis = q.popleft()
        if sec and dis >= sec:
            return min(ans)
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if 0 <= r < n and 0 <= c < n and not visited[r][c]:
                if init[r][c]:
                    sec = dis + 1
                    ans.append(init[r][c])
                q.append([r, c, dis + 1])
                visited[r][c] = 1
    return ans and min(ans) or 0

dr = ((0,1), (0,-1), (1,0), (-1,0))
n, k = map(int, input().split())
init = [list(map(int, input().split())) for _ in range(n)]
s, r, c = map(int, input().split())
print(sol(r-1, c-1))