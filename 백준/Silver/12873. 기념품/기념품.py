from collections import deque

n = int(input())
p = deque([x for x in range(1,n+1)])
for i in range(1,n,1):
    p.rotate((i**3)%len(p)*-1)
    p.pop()
print(*p)
