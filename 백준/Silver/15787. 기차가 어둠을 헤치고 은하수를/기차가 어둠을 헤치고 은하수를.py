import sys
input = sys.stdin.readline
from collections import deque

n, m = map(int, input().split())
d = {x+1:deque([0 for _ in range(20)]) for x in range(n)}
for _ in range(m):
    o = list(map(int, input().split()))
    if len(o) == 3:
        d[o[1]][o[2]-1] = (o[0]-1)^1
    elif o[0] == 3:
        d[o[1]].rotate()
        d[o[1]][0] = 0
    else:
        d[o[1]][0] = 0
        d[o[1]].rotate(-1)
log = set()
for k in d.keys():
    log.add(int(''.join(map(str, d[k])),2))
print(len(log)) 