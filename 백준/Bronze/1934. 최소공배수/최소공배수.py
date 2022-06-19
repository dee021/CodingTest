import sys
n = int(sys.stdin.readline())

for i in range(n):
    u, v = map(int, sys.stdin.readline().split())
    
    b, s = min(u,v), max(u,v)
    u, v = min(u,v), max(u,v)
    while u != 0:
        u, v = v%u, u
    print(int(b*s/v))