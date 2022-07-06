import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())

num = deque(list(map(int, sys.stdin.readline().split())))
s = deque([0 for _ in range(n)])
s[0] = num[0]

for i in range(1, n):
    s[i] = s[i-1] + num[i]


for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    print(s[b-1] - s[a-2]) if a > 1 else print(s[b-1])