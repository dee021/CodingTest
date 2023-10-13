import sys
input = sys.stdin.readline

from collections import deque
import bisect

def bfs(s):
    visited[s] = 1
    o = 2
    d = deque(vertex[r])
    while d:
        v = d.popleft()
        if visited[v]:
            continue
        visited[v] = o
        d.extend(vertex[v])
        o += 1

n, m, r = map(int, input().split())
vertex = [[] for _ in range(n+1)]
visited = [0 for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    vertex[a].insert(bisect.bisect_left(vertex[a], b), b)
    vertex[b].insert(bisect.bisect_left(vertex[b], a), a)
bfs(r)
print(*visited[1:], sep = '\n')