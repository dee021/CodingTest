import sys
from collections import deque
n = int(sys.stdin.readline())

p = deque([0] * 100)
p[0] = p[1] = p[2] = 1
p[3] = p[4] = 2 

for i in range(n):
    m = int(sys.stdin.readline())
    for i in range(0,m-5,1):
        p[i+5] = p[i+4] + p[i]
    print(p[m-1])