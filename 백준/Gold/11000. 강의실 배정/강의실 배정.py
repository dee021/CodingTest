from heapq import heapify, heappop, heappush
import sys
input = sys.stdin.readline

n = int(input())
time = [list(map(int, input().split())) for _ in range(n)]
heapify(time)
room = [heappop(time)[1]]

for _ in range(n-1):
    s, e = heappop(time)
    if room[0] <= s:
        heappop(room)
    heappush(room, e)
print(len(room))