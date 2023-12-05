import sys
import heapq
input = sys.stdin.readline

n, p = map(int, input().split())
d = {x:[] for x in range(1, n+1)}
ans = 0
for _ in range(n):
    m, c = map(int, input().split())
    while d[m] and c < -d[m][0]:
        ans += 1
        heapq.heappop(d[m])
    if d[m] and -d[m][0] == c:
        continue
    ans += 1
    heapq.heappush(d[m], -c)
print(ans)