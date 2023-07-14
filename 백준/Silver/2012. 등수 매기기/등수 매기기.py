import sys
input = sys.stdin.readline
from functools import reduce

n = int(input())
arr = sorted([int(input()) for _ in range(n)])
ans = reduce(lambda r, i: r+abs(i+1-arr[i]), range(n),0)
print(ans)