from collections import deque
import sys
input = sys.stdin.readline

def func1(r, c):
    h = arr[r][c]
    q = deque([[r, c]])
    tmp = set(['{} {}'.format(r, c)])
    while q:
        y, x = q.popleft()
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if not (0 <= r < n and 0 <= c < m):
                continue
            if arr[r][c] > h:
                return False
            elif arr[r][c] == h and '{} {}'.format(r, c) not in tmp:
                tmp.add('{} {}'.format(r, c))
                q.append([r, c])
    for s in tmp:
        r, c = map(int, s.split())
        visited[r][c] = 1
    return True

ans = 0
dr = [[0,1], [0,-1], [1,0], [-1,0], [-1, -1], [-1, 1], [1, 1], [1, -1]]
n, m = map(int, input().split())
visited = [[0 for _ in range(m)] for _ in range(n)]
arr = [list(map(int, input().split())) for _ in range(n)]

for r in range(n):
    for c in range(m):
        if arr[r][c] > 0 and not visited[r][c]:
            ans += func1(r,c)      
print(ans)