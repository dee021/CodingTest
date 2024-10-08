from heapq import heappop, heappush

def solution(n, k, enemy):
    pq = []
    cnt = 0
    for i in range(len(enemy)):
        cnt += enemy[i]
        heappush(pq, -enemy[i])
        while cnt > n and k and pq:
            k -= 1
            cnt += heappop(pq)
        if cnt > n:
            return i

    return len(enemy)