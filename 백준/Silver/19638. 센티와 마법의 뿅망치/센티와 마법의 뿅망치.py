import sys
input = sys.stdin.readline
import heapq

n, c, t = map(int, input().split())
cnt = 0
arr = []
for _ in range(n):
    h = int(input())
    if h >= c:
        heapq.heappush(arr, -h)

while arr and arr[0] < -1 and cnt < t:
    cnt += 1
    h = -heapq.heappop(arr) // 2
    if h < c:
        continue
    heapq.heappush(arr, -h)
    
if arr:
    print('NO', -arr[0], sep = '\n')
else:
    print('YES', cnt, sep = '\n')