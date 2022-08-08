import sys
from itertools import permutations

n, m = map(int, sys.stdin.readline().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))

for i in sorted(list(set(permutations(arr, m)))):
    print(*i)