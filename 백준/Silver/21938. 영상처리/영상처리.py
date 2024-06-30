import sys
from collections import deque
input = sys.stdin.readline

def sol(r, c):
    q = deque([[r, c]])
    rgb[r][c] = 0
    while q:
        y, x = q.popleft()
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if 0 <= r < n and 0 <= c < m and rgb[r][c] >= t:
                q.append([r, c])
                rgb[r][c] = 0

dr = [[0,1], [0,-1], [1,0], [-1,0]]
n, m = map(int, input().split())
rgb = [[] for _ in range(n)]
for i in range(n):
    line = list(map(int, input().split()))
    for j in range(m):
        rgb[i].append(sum(line[j*3:j*3+3])/3)
t = int(input())
ans = 0
for r in range(n):
    for c in range(m):
        if rgb[r][c] >= t:
            sol(r, c)
            ans += 1
print(ans)