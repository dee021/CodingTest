from collections import deque
from bisect import bisect_left
import sys
input = sys.stdin.readline

def search(value):
    return len(size) - bisect_left(size, value)

n = int(input())
size = deque(sorted(map(int, input().split())))

ans = 0
while len(size) > 1:
    ans += search(size.pop()*0.9)
print(ans)