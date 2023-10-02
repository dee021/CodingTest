import sys
input = sys.stdin.readline
from math import gcd

xy = [0 for _ in range(1001)] # xy[i] : x==y and 0<x<=i 를 만족하는 영역 중 통과하는 점의 개수
xy[1] = 1
for x in range(2, 1001):
    res = 0
    for y in range(1,x):
        if gcd(x, y) == 1:
            res += 1
    xy[x] = xy[x-1] + res

for _ in range(int(input())):
    print(xy[int(input())]*2+1)