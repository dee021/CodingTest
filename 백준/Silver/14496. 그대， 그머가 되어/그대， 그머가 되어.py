from collections import deque
import sys
input = sys.stdin.readline

def sol(start, end):
    q = deque([[start, 0]])
    visited[start] = 1
    while q:
        cur, cnt = q.popleft()
        for post in conv[cur]:
            if post == end:
                return cnt + 1
            if visited[post] == 0:
                visited[post] = 1
                q.append([post, cnt + 1])
    return -1

a, b = map(int, input().split())
n, m = map(int, input().split())
conv = {x:[] for x in range(1, n+1)}
visited = [0 for _ in range(n+1)]
for _ in range(m):
    x, y = map(int, input().split())
    conv[x].append(y)
    conv[y].append(x)
if a == b:
    print(0)
else:
    print(sol(a, b))