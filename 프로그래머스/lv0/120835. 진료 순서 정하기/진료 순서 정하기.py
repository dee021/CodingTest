def solution(emergency):
    answer = []
    for x in emergency:
        more = 1
        for y in emergency:
            if x == y:
                pass
            if x < y:
                more += 1
        answer.append(more)
    return answer