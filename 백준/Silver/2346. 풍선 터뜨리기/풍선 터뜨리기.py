import sys
input = sys.stdin.readline
from collections import deque

n = int(input())
arr = deque()
for i, v in enumerate(map(int, input().split())):
    arr.append([i+1, v])
for j in range(n):
    i, v = arr.popleft()
    print(i, end=(' ' if j < n-1 else ''))
    arr.rotate(-v+(1 if v > 0 else 0))