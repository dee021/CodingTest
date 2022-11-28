def solution(array, n):
    answer = 100
    diff = 100
    for num in array:
        if abs(n-num) < diff:
            answer = num
            diff = abs(n-num)
        elif abs(n-num) == diff:
            answer = min(answer, num)
    return answer