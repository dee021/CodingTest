import sys
from itertools import product

n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
for i in sorted(list(product(arr, repeat=m))):
    print(*i)