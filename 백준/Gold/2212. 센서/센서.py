from heapq import heappop, heappush
import sys
input = sys.stdin.readline

n = int(input())
k = int(input())
arr = list(map(int, input().split()))
arr.sort()
dis = []
ans = arr[-1] - arr[0]
for i in range(n-1):
    heappush(dis, -(arr[i+1] - arr[i]))

while dis and k -1 > 0:
    k -= 1
    ans += heappop(dis)
print(ans)