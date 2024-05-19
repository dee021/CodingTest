import sys
from collections import deque
input = sys.stdin.readline

def sol(start, target):
    q = deque([[start, 0]])
    visited = [float('inf') for _ in range(n+1)]
    while q:
        cur, w = q.popleft()
        if cur in adj:
            for post in adj[cur]:
                if post != start and weight[cur][post] + w < visited[post]:
                    visited[post] = weight[cur][post] + w
                    q.append([post, visited[post]])
    return visited[target]

n = int(input())
m = int(input())
weight = [[-1 for _ in range(n+1)] for _ in range(n+1)]
adj = {}
for _ in range(m):
    s, e, w = map(int, input().split())
    if weight[s][e] == -1 or weight[s][e] > w:
        weight[s][e] = w
    adj.setdefault(s, []).append(e)

start, target = map(int, input().split())
print(sol(start, target) if start != target else 0)