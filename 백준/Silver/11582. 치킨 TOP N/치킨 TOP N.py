import sys
import math
input = sys.stdin.readline

p = int(input())
arr = list(map(int, input().split()))
k = int(input())
if k == 1:
    print(*sorted(arr))
    exit(0)
for l in range(1, int(math.log2(p))+1):
    s = 0
    for f in range(0, len(arr), 2**l):
        s += 1
        arr[f:f+2**l] = sorted(arr[f:f+2**l])
    if k == s:
        break
print(*arr)