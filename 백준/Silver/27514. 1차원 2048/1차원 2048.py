import math
import sys
input = sys.stdin.readline

ans = 0
e = [0 for _ in range(64)]
input()
for k in map(int, input().split()):
    if k:
        e[int(math.log2(k))] += 1

for i in range(63):
    if e[i]:
        ans = i
    e[i+1] += e[i]//2
    
print(2**ans)