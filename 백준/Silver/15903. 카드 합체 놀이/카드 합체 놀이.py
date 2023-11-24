import heapq

n, m = map(int, input().split())
arr = list(map(int, input().split()))
heapq.heapify(arr)
ans = sum(arr)

for i in range(m):
    a, b = heapq.heappop(arr), heapq.heappop(arr)
    ans += a+b
    heapq.heappush(arr, a+b)
    heapq.heappush(arr, a+b)
print(ans)