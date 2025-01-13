import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(p, dep = 0):
    node[p] = dep
    if p not in adj:
        return
    for post in sorted(adj[p], reverse=True):
        if node[post] == -1:
            dfs(post, dep+1)

n, m, r = map(int, input().split())
node = [-1 for _ in range(n)]
adj = {}

for _ in range(m):
    a, b = map(int, input().split())
    adj.setdefault(a-1, []).append(b-1)
    adj.setdefault(b-1, []).append(a-1)

dfs(r-1)

print('\n'.join(map(str, node)))