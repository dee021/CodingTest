from collections import deque

def solution(priorities, location):
    answer = 0
    d = deque(priorities)
    priorities.sort(reverse=True)
    while d:
        while d[0] != priorities[0]:
            d.rotate(-1)
            location -= 1
            if location < 0:
                location += len(priorities)
        answer += 1
        del priorities[0]
        d.popleft()
        if not location:    
            return answer
        location -= 1