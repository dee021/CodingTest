import sys
input = sys.stdin.readline
from collections import deque
import bisect

def dfs(s):
    visited[s] = 1
    o = 2
    d = deque(vertex[r])
    while d:
        v = d.popleft()
        if visited[v]:
            continue
        visited[v] = o
        for post in vertex[v][::-1]:
            if not visited[post]:
                d.appendleft(post)
        o += 1

n, m, r = map(int, input().split())
vertex = [[] for _ in range(n+1)]
visited = [0 for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    vertex[a].insert(bisect.bisect_left(vertex[a], b), b)
    vertex[b].insert(bisect.bisect_left(vertex[b], a), a)
dfs(r)
print(*visited[1:], sep = '\n')