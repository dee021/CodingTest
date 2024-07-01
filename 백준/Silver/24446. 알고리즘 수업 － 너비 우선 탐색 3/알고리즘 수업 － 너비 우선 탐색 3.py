import sys
from collections import deque
input = sys.stdin.readline

def bfs(node):
    q = deque([[node, 0]])
    visited[node] = 0
    while q:
        cur, depth = q.popleft()
        for post in nodes[cur]:
            if visited[post] < 0:
                visited[post] = depth +1
                q.append([post, depth +1])

n, m, r = map(int, input().split())
visited = [-1 for _ in range(n+1)]
nodes = {x:[] for x in range(1, n+1)}
for _ in range(m):
    u, v = map(int, input().split())
    nodes[u].append(v)
    nodes[v].append(u)
bfs(r)
print(*visited[1:], sep='\n')