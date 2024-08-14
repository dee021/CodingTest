import sys
input = sys.stdin.readline

def dfs(node):
    global ans
    order = 0
    stack = [[node, 0]]
    while stack:
        node, depth = stack.pop()
        if not visited[node]:
            order += 1
            ans += depth * order
            visited[node] = 1
            for post in sorted(edges[node]):
                if not visited[post]:
                    stack.append([post, depth +1])

n, m, r = map(int, input().split())
ans = 0
visited = [0 for _ in range(n+1)]
visited[0] = 1
edges = {}
for _ in range(m):
    a, b = map(int, input().split())
    edges.setdefault(a, set()).add(b)
    edges.setdefault(b, set()).add(a)
dfs(r)
print(ans)