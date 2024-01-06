from collections import deque

def solution(numbers, target):
    answer = 0
    oper = [1,-1]
    l = len(numbers)
    q = deque([[0, -numbers[0]], [0, numbers[0]]])
    while q:
        idx, res = q.popleft()
        idx += 1
        for i in range(2):
            tmp = res + oper[i]*numbers[idx]
            if idx == l-1:
                if tmp == target:
                    answer += 1
            else:
                    q.append([idx, tmp])

    return answer