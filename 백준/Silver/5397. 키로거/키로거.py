from collections import deque
import sys
input = sys.stdin.readline

for _ in range(int(input())):
    p, w = [], deque() # pw = p + w
    for o in input().strip():
        if o.isalpha() or o.isnumeric():
            p.append(o)
        elif p and o == '-':
            p.pop()
        elif p and o == '<':
            w.appendleft(p.pop())
        elif w and o == '>':
            p.append(w.popleft())
    print(''.join(p) + ''.join(w))