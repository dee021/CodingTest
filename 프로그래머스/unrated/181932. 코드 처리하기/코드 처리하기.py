def solution(code):
    mode = False
    answer = ''
    for i, c in enumerate(code):
        cond = not mode^(i%2)
        if c == '1':
            mode = not mode
        elif cond:
            answer += c 
    return answer if answer else "EMPTY"