def solution(order):
    stack = []
    answer = 0
    cur = 1
    for i in range(len(order)):
        while order[i] > cur:
            stack.append(cur)
            cur += 1
        if order[i] == cur:
            answer += 1
            cur += 1
        elif order[i] < cur and stack[-1] == order[i]:
            answer += 1
            stack.pop()
        else:
            break
    return answer