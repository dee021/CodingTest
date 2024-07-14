from collections import deque
import sys
input = sys.stdin.readline

def dfs(start, target):
    q = deque([[start, 0]])
    visited = [0 for _ in range(n+1)]
    visited[start] = 1
    while q:
        cur, w = q.popleft()
        for i in range(1,n+1):
            if nodes[cur][i] and not visited[i]:
                visited[i] = 1
                q.append([i, w + nodes[cur][i]])
                if i == target:
                    return w + nodes[cur][i]

n, m =map(int, input().split())
nodes = [[0 for _ in range(n+1)] for _ in range(n+1)]

for _ in range(n-1):
    a, b, dis = map(int, input().split())
    nodes[a][b] = nodes[b][a] = dis

for _ in range(m):
    print(dfs(*map(int, input().split())))