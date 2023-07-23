import sys
input = sys.stdin.readline
from collections import deque

def dfs(v, l):
    f = set()
    ans = []
    s = [v]
    while s:
        v = s.pop()
        if v in ans:
            continue
        ans.append(v)
        f.add(v)
        for i, e in enumerate(g[v-1][::-1]):
            if e and l-i not in f:
                s.append(l-i)
    return ans

def bfs(v):
    f = set()
    ans = []
    q = deque([v])
    while q:
        v = q.popleft()
        if v in ans:
            continue
        ans.append(v)
        f.add(v)
        for i, e in enumerate(g[v-1]):
            if e and i+1 not in f:
                q.append(i+1)
    return ans

n, e, v = map(int, input().split())
g = [[0 for _ in range(n)] for _ in range(n)]

for _ in range(e):
    a, b = map(int, input().split())
    g[a-1][b-1] = 1
    g[b-1][a-1] = 1
print(*dfs(v, n))
print(*bfs(v))