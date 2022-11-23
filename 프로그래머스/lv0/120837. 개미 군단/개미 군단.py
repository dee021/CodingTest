def solution(hp):
    answer = 0
    for att in [5,3,1]:
        answer += hp//att
        hp = hp%att
    return answer