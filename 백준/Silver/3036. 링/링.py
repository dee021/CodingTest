import sys
n = int(input())
ring = list(map(int, sys.stdin.readline().split()))

def findFactor(num):
    if ring.index(num) == 0:
        return 0
    else:
        u, v = max(ring[0],num), min(ring[0], num)
        while u != 0:
            u, v = v%u, u
        return v

factor = list(map(findFactor, ring))
for i in range(1,n):
    if factor[i] == 0:
        print('1/1')
    else:
        print(ring[0]//factor[i],'/',ring[i]//factor[i], sep='')
