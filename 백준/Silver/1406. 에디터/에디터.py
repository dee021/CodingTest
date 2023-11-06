import sys
input = sys.stdin.readline
from collections import deque

b = list(input().strip())
a = deque()
for _ in range(int(input())):
    o = input().strip().split()
    if o[0] == 'B' and b:
        b.pop()
    elif o[0] == 'P':
        b.append(o[1])
    elif o[0] == 'L' and b:
        a.appendleft(b.pop())
    elif o[0] == 'D' and a:
        b.append(a.popleft())
print(''.join(b) + ''.join(a))