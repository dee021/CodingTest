import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    
    answer = 0
    while scoville:
        a = heapq.heappop(scoville)
        if a >= K:
            return answer
        if a < K and not scoville:
            return -1
        b = heapq.heappop(scoville)
        a += 2*b
        heapq.heappush(scoville, a)
        answer += 1
    return -1 if scoville else answer