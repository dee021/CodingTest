import sys
from collections import deque
input = sys.stdin.readline

def bfs(s):
    q = deque([[s, 0]])
    visited[s] = 1
    while q:
        cur, cnt = q.popleft()
        for post in arr[cur] + [cur +1, cur -1]:
            if 0 < post <= n and not visited[post]:
                if post == e:
                    return cnt +1
                q.append([post, cnt + 1])
                visited[post] = 1

n, m = map(int, input().split())
arr = [[] for _ in range(n+1)]
visited = [0 for _ in range(n+1)]
s, e = map(int, input().split())
for _ in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)
print(bfs(s))