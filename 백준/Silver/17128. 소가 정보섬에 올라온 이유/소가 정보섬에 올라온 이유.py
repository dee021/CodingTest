from functools import reduce
import sys
input = sys.stdin.readline
mul = lambda tmp : reduce(lambda x, y: x*y, tmp)

n, q = map(int, input().split())
cow = list(map(int, input().split()))
cow += cow[:3]
revs = list(map(int, input().split()))
mem = [0 for _ in range(n)]
s = 0
for i in range(n):
    mem[i] = mul(cow[i:i+4])
    s += mem[i]

for r in revs:
    for i in range(4):
        mem[r-i-1] *= -1
        s += mem[r-i-1]*2
    print(s)