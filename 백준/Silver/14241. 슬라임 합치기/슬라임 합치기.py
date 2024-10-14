from heapq import heapify, heappop, heappush

n = int(input())
arr = list(map(int, input().split()))
heapify(arr)
score = 0
while len(arr) > 1:
    a, b = heappop(arr), heappop(arr)
    score += a*b
    heappush(arr, a+b)
print(score)