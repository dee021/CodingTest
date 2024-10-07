import sys
input = sys.stdin.readline
from heapq import heapify, heappop, heappush
conv = lambda x: int(x) if x.isnumeric() else x

a, b, n = map(int, input().split())
red = []
blue = []
gift = [list(map(conv, input().strip().split())) for _ in range(n)]
heapify(gift)
num = 0
while gift:
    num += 1
    t, color, cnt = heappop(gift)
    if color == 'B':
        blue.append(num)
    else:
        red.append(num)

    if cnt >1:
        heappush(gift, [t + (a if color == 'B' else b), color, cnt-1])

print(len(blue))
print(*blue)
print(len(red))
print(*red)