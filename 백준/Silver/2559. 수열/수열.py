import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())

num = deque(list(map(int, sys.stdin.readline().split())))
s = deque([0 for _ in range(n)])
s[0] = num[0]

for i in range(1, m):
    s[i] = s[i-1] + num[i]

for i in range(m, n):
    s[i] = s[i-1] + num[i] - num[i-m]
    
for i in range(m-1):
    s.popleft()

print(max(s))