from collections import deque
import sys
input = sys.stdin.readline

def bfs():
    q = deque([[1,0]])
    while q:
        cur, d = q.popleft()
        for post in edges[cur]:
            if post > 1 and not dist[post]:
                dist[post] = d + 1
                q.append([post, d + 1])

n, m = map(int, input().split())
dist = [0 for _ in range(n+1)]
edges = {}
for _ in range(m):
    a, b = map(int, input().split())
    edges.setdefault(a, []).append(b)
    edges.setdefault(b, []).append(a)
bfs()

v, d, cnt = 0,0,0
for i in range(2, n+1):
    if dist[i] > d:
        d = dist[i]
        cnt = 1
        v = i
    elif dist[i] == d:
        cnt += 1
print(v, d, cnt)