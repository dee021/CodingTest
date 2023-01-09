def solution(s):
    f = 0
    for c in s:
        if c == '(':
            f += 1
        elif not f:
            f = 1
            break
        else:
            f -= 1
    answer = False if f else True
    return answer