import sys
input = sys.stdin.readline
from collections import deque

def sol(nd):
    visited = [0 for _ in range(n+1)]
    visited[nd] = 1
    q = deque([nd])
    while q:
        no = q.popleft()
        for k in computer[no]:
            if not visited[k]:
                visited[k] = 1
                q.append(k)
    cnt[nd] = sum(visited)

n, m = map(int, input().split())
computer = {x:[] for x in range(1, n+1)}
cnt = [0 for _ in range(n+1)]
for i in range(m):
    a, b = map(int, input().split())
    computer[b].append(a)

c = 0
for i in range(1, n+1):
    sol(i)
    c = max(c, cnt[i])
print(*[x for x in range(n+1) if cnt[x] == c])