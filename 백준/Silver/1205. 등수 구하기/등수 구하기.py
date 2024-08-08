from heapq import heapify, heappop, heappush

conv = lambda x: -int(x)

rank, cnt = 1,-1
n, s, p = map(int, input().split())
score = [-s]
if n:
    score.extend(list(map(conv, input().split())))
heapify(score)
while score and score[0] <= -s:
    sc = -heappop(score)
    if sc > s:
        rank += 1
    else:
        cnt += 1

if rank + cnt <= p:
    print(rank)
else:
    print(-1)