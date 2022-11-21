def solution(angle):
    answer = 1
    answer += 1 if angle >= 90 else 0
    answer += 1 if angle > 90 else 0 
    answer += 1 if angle == 180 else 0
    return answer