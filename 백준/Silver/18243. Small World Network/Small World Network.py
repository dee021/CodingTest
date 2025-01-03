from collections import deque
import sys
input = sys.stdin.readline

def sol(node):
    q = deque([node])
    while q:
        cur = q.popleft()
        if cur in adj:
            for post in adj[cur]:
                if network[node][post] >= network[node][cur]+1:
                    network[node][post] = network[post][node] = network[node][cur]+1
                    q.append(post)

n, k = map(int, input().split())
network = [[float('inf') if x != y else 0 for x in range(n)] for y in range(n)]
adj = {}
for _ in range(k):
    a, b = map(int, input().split())
    adj.setdefault(a-1, []).append(b-1)
    adj.setdefault(b-1, []).append(a-1)

for i in range(n):
    if i in adj:
        sol(i)

for i in range(n-1):
    for j in range(i+1, n):
        if network[i][j] > 6:
            print('Big World!')
            exit(0)
print('Small World!')