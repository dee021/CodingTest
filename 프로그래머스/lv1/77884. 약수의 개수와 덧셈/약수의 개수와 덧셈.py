def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        sub = 0
        for j in range(1, i+1):
            if i%j == 0:
                sub += 1
        if sub % 2:
            answer -= i
        else:
            answer += i
    return answer