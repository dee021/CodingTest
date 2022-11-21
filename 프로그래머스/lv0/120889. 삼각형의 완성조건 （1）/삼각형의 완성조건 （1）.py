def solution(sides):
    sides.sort()
    answer = 1 if sides.pop() < sum(sides) else 2
    return answer