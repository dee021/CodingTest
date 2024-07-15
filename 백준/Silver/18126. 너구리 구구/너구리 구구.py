from collections import deque
import sys
input = sys.stdin.readline

def sol():
    global ans
    
    visited = [0 for _ in range(n+1)]
    q = deque([[1, 0]])
    visited[1] = 1
    while q:
        cur, dis = q.popleft()
        ans = max(dis, ans)
        for post, w in nodes[cur]:
            if not visited[post]:
                visited[post] = 1
                q.append([post, dis + w])

n = int(input())
nodes = [[] for _ in range(n+1)]
for _ in range(n-1):
    a, b, c = map(int, input().split())
    nodes[a].append([b,c])
    nodes[b].append([a,c])
ans = 0
sol()
print(ans)