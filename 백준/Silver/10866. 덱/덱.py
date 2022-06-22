import sys
from collections import deque

n = int(input())

intdeque = deque()

def push_front(x):
    intdeque.appendleft(x)
def push_back(x):
    intdeque.append(x)
def pop_front():
    if intdeque:
        return intdeque.popleft()+'\n'
    else:
        return '-1\n'
def pop_back():
    if intdeque:
        return intdeque.pop()+'\n'
    else:
        return '-1\n'
def size():
    return str(len(intdeque))+'\n'
def empty():
    if intdeque:
        return '0\n'
    else:
        return '1\n'
def front():
    if intdeque:
        return str(intdeque[0])+'\n'
    else:
        return '-1\n'
def back():
    if intdeque:
        return str(intdeque[-1])+'\n'
    else:
        return '-1\n'


for i in range(n):
    order = sys.stdin.readline().strip()
    order = order.split()
    if len(order) == 1:
        if '_front' in order[0]:
            sys.stdout.write(pop_front())
        elif '_back' in order[0]:
            sys.stdout.write(pop_back())
        elif 'front' in order:
            sys.stdout.write(front())
        elif 'back' in order:
            sys.stdout.write(back())
        elif 'size' in order:
            sys.stdout.write(size())
        elif 'empty' in order:
            sys.stdout.write(empty())
    else:
        if '_front' in order[0]:
            push_front(order[1])
        elif '_back' in order[0]:
            push_back(order[1])