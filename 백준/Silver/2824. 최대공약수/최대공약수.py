import sys
from functools import reduce
from math import  gcd
input = sys.stdin.readline

n = int(input())
a = reduce(lambda x, y:x*y, map(int, input().split()))
m = int(input())
b = reduce(lambda x, y:x*y, map(int, input().split()))
ans = str(gcd(a, b))
print(len(ans) <= 9 and ans or ans[-9:])