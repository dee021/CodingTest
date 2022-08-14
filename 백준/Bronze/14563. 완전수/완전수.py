import sys
from collections import deque

t = int(sys.stdin.readline())
arr = deque(map(int, sys.stdin.readline().split()))

for i in range(t):
    res = 0
    num = arr.popleft()
    for j in range(1, num):
        if num%j == 0:
            res += j
    if res < num:
        print('Deficient')
    else:
        print('Perfect' if res == num else 'Abundant')