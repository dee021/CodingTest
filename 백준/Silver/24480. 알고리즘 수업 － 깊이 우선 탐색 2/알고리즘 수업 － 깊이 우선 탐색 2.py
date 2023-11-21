import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def dfs(cur, order):
    visited[cur] = order
    for post in sorted(node[cur], reverse=True):
        if not visited[post]:
            order += 1
            visited[post] = order
            order = dfs(post, order)
    return order

n, m, r = map(int, input().split())
visited = [0 for _ in range(n+1)]
node = {x:[] for x in range(1, n+1)}
for _ in range(m):
    u, v = map(int, input().split())
    node[u].append(v)
    node[v].append(u)
dfs(r, 1)
print(*visited[1:], sep='\n')