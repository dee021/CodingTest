import math
import sys
input = sys.stdin.readline

n = int(input())
x = sum(map(int, input().split()))
y = sum(map(int, input().split()))

gcd = math.gcd(x, y)
a, b = y//gcd, x//gcd
print(a, b)