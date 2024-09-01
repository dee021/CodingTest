from collections import deque
import sys
input = sys.stdin.readline

def sol(cur):
    q = deque([[cur, 0]])
    arr[cur] = -1
    while q:
        cur, cnt = q.popleft()
        for dis in dr:
            post = cur + dis
            if 0 < post <= n and arr[post] == 0:
                if post == d:
                    return cnt + 1
                q.append([post, cnt+1])
                arr[post] = -1
    return 'BUG FOUND'

n, s, d, f, b, k = map(int, input().split())
dr = [f, -b]
arr = [0 for _ in range(n+1)]
if k:
    for i in map(int, input().split()):
        arr[i] = -1
print(sol(s))