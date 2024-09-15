from heapq import heappop, heappush
import sys
input = sys.stdin.readline

n, m, k = map(int, input().split())
beer = [list(map(int, input().split())) for _ in range(k)]
beer.sort(key=lambda x:(x[1], -x[0]))

pq = []
p = 0
for i in range(k):
    if len(pq) < n:
        heappush(pq, beer[i])
        p += beer[i][0]
    else:
        if pq[0][0] < beer[i][0]:
            tmp = heappop(pq)
            heappush(pq, beer[i])
            p += beer[i][0] - tmp[0]
    
    if len(pq) == n and p >= m:
        break
if p >= m:
    print(max([list(x) for x in zip(*pq)][1]))
else:
    print(-1)