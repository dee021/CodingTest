from collections import deque
import sys
input = sys.stdin.readline

def bfs(cur):
    order = 1
    visited[cur] = order
    q = deque([cur])
    while q:
        cur = q.popleft()
        for post in sorted(node[cur], reverse=True):
            if not visited[post]:
                order += 1
                visited[post] = order
                q.append(post)

n, m, r = map(int, input().split())
visited = [0 for _ in range(n+1)]
node = {x:[] for x in range(1, n+1)}
for _ in range(m):
    u, v = map(int, input().split())
    node[u].append(v)
    node[v].append(u)
bfs(r)
print(*visited[1:], sep='\n')