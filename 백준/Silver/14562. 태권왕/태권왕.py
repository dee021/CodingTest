import sys
from collections import deque
input = sys.stdin.readline

def bfs(s, t):
    q = deque([[s, t, 0]])
    while True:
        s, t, cnt = q.popleft()
        if 2*s == t+3 or s+1 == t:
            return cnt +1
        if s*2 <= t+3:
            q.append([s*2, t+3, cnt +1])
        q.append([s+1, t, cnt +1])

for _ in range(int(input())):
    s, t = map(int, input().split())
    print(bfs(s, t))