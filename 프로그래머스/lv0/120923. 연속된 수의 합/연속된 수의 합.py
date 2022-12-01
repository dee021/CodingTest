def solution(num, total):
    answer = [x for x in range(1, num+1)]
    d = 0
    while sum(answer) + d < total:
        d += num
    while sum(answer) + d > total:
        d -= num
    return [x for x in range(1+d//num, num+1+d//num)]