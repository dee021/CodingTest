from collections import deque

def solution(numbers):
    mem = deque()
    answer = [-1 for _ in range(len(numbers))]
    for i in range(len(numbers)-1, -1, -1):
        while mem and mem[0] <= numbers[i]:
            mem.popleft()
        if mem:
            answer[i] = mem[0]
        mem.appendleft(numbers[i])
    return answer