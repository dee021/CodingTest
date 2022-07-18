import sys
from collections import deque
queue = deque()
def push(num, q):
    q.append(num)

def oper(txt, q):
    size = len(q)
    if txt == 'pop':
        if size == 0:
            ans = -1
        else:
            ans = q.popleft()
    elif txt == 'size':
        ans = size
    elif txt == 'empty':
        if size == 0:
            ans = 1
        else:
            ans = 0
    elif txt == 'front':
        if size == 0:
            ans = -1
        else:
            ans = q[0]
    else: # back
        if size == 0:
            ans = -1
        else:
            ans = q[-1]
    return str(ans)

n = int(sys.stdin.readline())

for i in range(n):
    order = sys.stdin.readline().split()
    if len(order) == 1:
        ans = oper(order[0], queue)
        sys.stdout.write(ans+'\n')
    else:
        push(order[1], queue)