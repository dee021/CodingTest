import sys
from collections import deque

n = int(sys.stdin.readline())
queue = deque()

for i in range(n):
    order = sys.stdin.readline().strip()
    if 'push' in order:
        queue.append(order.split()[1])
    elif 'pop' in order:
        sys.stdout.write(queue.popleft()+'\n' if queue else '-1\n')
    elif 'size' in order:
        sys.stdout.write(str(len(queue))+'\n')
    elif 'empty' in order:
        sys.stdout.write('0\n' if queue else '1\n')
    elif 'front' in order:
        sys.stdout.write(queue[0]+'\n' if queue else '-1\n')
    else: # back
        sys.stdout.write(queue[-1]+'\n' if queue else '-1\n')
        