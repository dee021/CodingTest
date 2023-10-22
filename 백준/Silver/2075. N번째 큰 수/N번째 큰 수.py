import sys
input = sys.stdin.readline
import heapq

n = int(input())
arr = []
for _ in range(n):
    for k in list(map(int, input().split())):
        if len(arr) >= n and k < arr[0]:
            continue
        if len(arr) >= n:
            heapq.heappop(arr)
        heapq.heappush(arr, k)
print(min(arr))