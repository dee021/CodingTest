def solution(myStr):
    answer = []
    t = ''
    for c in myStr:
        if c not in ['a', 'b', 'c']:
            t += c
        else:
            if t:
                answer.append(t)
                t = ''
    if t: answer.append(t)
    return answer and answer or ["EMPTY"]