import sys
input = sys.stdin.readline

def dfs(node, depth):
    s = [[node, depth]]
    while s:
        node, depth = s.pop()
        if ans[node] != -1:
            continue
        ans[node] = depth
        for post in sorted(edges[node], reverse=True):
            if ans[post] == -1:
                s.append([post, depth + 1])

n, m, r = map(int, input().split())
ans = [-1 for _ in range(n+1)]
edges = {x:[] for x in range(1, n+1)}

for _ in range(m):
    a, b = map(int, input().split())
    edges[a].append(b)
    edges[b].append(a)

dfs(r, 0)
print(*ans[1:], sep = '\n')