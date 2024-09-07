from collections import deque

def bfs(n):
    answer = 0
    depth = 0
    visited = [0 for _ in range(n+1)]
    q = deque([1])
    while q:
        node = q.popleft()
        for post in adj[node]:
            if post > 1 and not visited[post]:
                visited[post] = visited[node] + 1
                if visited[post] > depth:
                    depth = visited[post]
                    answer = 1
                elif visited[post] == depth:
                    answer += 1
                q.append(post)
    return answer

def solution(n, edge):
    for a, b in edge:
        adj.setdefault(a, []).append(b)
        adj.setdefault(b, []).append(a)
    
    return bfs(n)

adj = {}