from heapq import heapify, heappush, heappop
from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
price = [int(input()) for _ in range(n)]
cars = [0] + [int(input()) for _ in range(m)]
place = [x for x in range(n)]
heapify(place)
waited = deque([])
ans = 0
for _ in range(2*m):
    car = int(input())
    if car < 0:
        heappush(place, cars[-car])
    else:
        waited.append(car)
    while place and waited:
        car = waited.popleft()
        p = heappop(place)
        ans += cars[car] * price[p]
        cars[car] = p
print(ans)