import sys
input = sys.stdin.readline
from collections import deque

n = int(input())
b = deque([])
while True:
    p = input().strip()
    if p == '-1':
        break
    elif p == '0':
        b.popleft()
    elif len(b) < n:
        b.append(p)
print(' '.join(b) if b else 'empty')