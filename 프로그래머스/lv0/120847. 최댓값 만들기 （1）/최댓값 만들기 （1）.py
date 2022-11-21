def solution(numbers):
    numbers.sort()
    answer = numbers.pop()
    answer *= numbers.pop()
    return answer