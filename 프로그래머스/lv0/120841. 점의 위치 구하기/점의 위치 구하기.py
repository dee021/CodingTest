def solution(dot):
    answer = 1 if dot[1] > 0 else 3
    answer += 1 if dot[0]*dot[1] < 0 else 0
    return answer