import sys
from itertools import combinations_with_replacement as cb

n, m = map(int, sys.stdin.readline().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))

for i in sorted(list(set(cb(arr, m)))):
    print(*i)