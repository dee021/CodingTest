def solution(food):
    answer = ''
    for f, n in enumerate(food[1:], 1):
        answer += str(f) * (n//2)
    return answer+'0'+answer[::-1]