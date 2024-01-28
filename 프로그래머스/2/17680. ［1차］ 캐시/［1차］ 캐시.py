from collections import deque

def solution(cacheSize, cities):
    answer = 0
    queue = deque([])
    for ct in cities:
        if queue and ct.lower() in queue:
            answer += 1
            queue.remove(ct.lower())
            queue.append(ct.lower())
        else:
            answer += 5
            if queue and len(queue) >= cacheSize:
                queue.popleft()
            if cacheSize:
                queue.append(ct.lower())
    return answer
