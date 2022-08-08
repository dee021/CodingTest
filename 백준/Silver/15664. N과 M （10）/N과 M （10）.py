import sys
from itertools import combinations

n, m = map(int, sys.stdin.readline().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))

for i in sorted(list(set(combinations(arr, m)))):
    print(*i)