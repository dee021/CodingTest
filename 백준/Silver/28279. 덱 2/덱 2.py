import sys
from collections import deque
input = sys.stdin.readline

ds = deque()
dq = {'1':lambda x:ds.appendleft(x), '2':lambda x:ds.append(x),
        '3':lambda x:ds.popleft() if ds else -1,
        '4':lambda x:ds.pop() if ds else -1,
        '5':lambda x:len(ds), '6':lambda x:0 if ds else 1,
        '7':lambda x:ds[0] if ds else -1,
        '8':lambda x:ds[-1] if ds else -1}

n = int(input())
for _ in range(n):
    oper = input().strip().split()
    if oper[0] in ['1', '2']:
        dq[oper[0]](oper[1])
    else:
        print(dq[oper[0]](1))