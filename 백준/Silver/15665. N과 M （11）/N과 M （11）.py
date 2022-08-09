import sys
from itertools import product

n, m = map(int, sys.stdin.readline().split())
arr = set(map(int, sys.stdin.readline().split()))

arr = sorted(list(product(sorted(list(arr)), repeat = m)))
for i in arr:
    print(*i)