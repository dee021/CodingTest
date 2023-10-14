from collections import deque

def solution(elements):
    elements = deque(elements)
    answer = set()
    for l in range(len(elements)):
        for _ in range(len(elements)):
            answer.add(sum(list(elements)[:l+1]))
            elements.rotate()
    return len(answer)