import sys
from collections import deque
n = int(sys.stdin.readline())

st = deque([0] * n)
sc = deque([0] * n)


for i in range(n):
    st[i] = int(sys.stdin.readline())

sc[0] = st[0]
if n > 1:
    sc[1] = st[0] + st[1]
if n > 2:
    sc[2] = max(st[0],st[1]) + st[2]

for i in range(3,n,1):
    sc[i] = max(sc[i-2],sc[i-3]+st[i-1]) + st[i]
print(sc[n-1])