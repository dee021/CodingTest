from collections import deque

def sol():
    s = g[1]
    cnt = len(s)
    while s:
        p = s.pop()
        for i in g[p]:
            if counted[i]:
                counted[i] = 0
                cnt += 1
    return cnt

n = int(input())
g = [[] for _ in range(n+1)]
for _ in range(int(input())):
    a, b = map(int, input().split())
    g[a].append(b)
    g[b].append(a)
counted = [0 if i in g[1] else 1 for i in range(n+1)]
counted[1] = 0
print(sol())