from heapq import heappop, heappush

cur = 0
q = []

for _ in range(3):
    c, d = map(int, input().split())
    q.append([0, c, d])
h = int(input())

while h > 0:
    t, c, d = heappop(q)
    cur += t - cur
    h -= d
    heappush(q, [t+c, c, d])

print(cur)