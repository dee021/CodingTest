import sys
input = sys.stdin.readline
from collections import deque

def bfs():
    ans = []
    q = deque([[x, 0]])
    visited[x] = 0
    while q:
        v, d = q.popleft()
        for post in path.get(v, []):
            if visited[post]:
                if d == k-1:
                    ans.append(post)
                else:
                    q.append([post, d+1])
                visited[post] = 0
    return ans if ans else [-1]
        
n, m, k, x = map(int, input().split())
path = {}
visited = [1 for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    path.setdefault(a, []).append(b)
sys.stdout.write('\n'.join(map(str, sorted(bfs()))))