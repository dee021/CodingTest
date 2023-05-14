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
        heapq.heappush(scoville, a+2*heapq.heappop(scoville))
        answer += 1