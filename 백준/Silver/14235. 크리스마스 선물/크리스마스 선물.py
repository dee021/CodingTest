import sys
input = sys.stdin.readline
import heapq

n = int(input())
gift = []
for _ in range(n):
    m, *t = list(map(int, input().split()))
    if not m:
        print(-heapq.heappop(gift) if gift else -1)
    else:
        for g in t:
            heapq.heappush(gift, -g)