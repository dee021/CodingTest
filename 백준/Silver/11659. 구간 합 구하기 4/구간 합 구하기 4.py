import sys
from itertools import accumulate

n, m = map(int, sys.stdin.readline().split())

num = list(map(int, sys.stdin.readline().split()))
num = list(accumulate(num))

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    print(num[b-1]-num[a-2]) if a != 1 else print(num[b-1])