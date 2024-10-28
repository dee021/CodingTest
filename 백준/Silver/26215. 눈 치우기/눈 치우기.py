from heapq import heapify, heappop, heappush
import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int.__neg__, map(int, input().split())))
heapify(arr)
ans = 0


while ans <= 1440 and len(arr) > 1:
    ans += 1
    b = -heappop(arr)
    s = -heappop(arr)
    if b > 1:
        heappush(arr, -b+1)
    if s > 1:
        heappush(arr, -s+1)
if arr:
    ans -= heappop(arr)
print(ans <= 1440 and ans or -1)