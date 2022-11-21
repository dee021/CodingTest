def solution(numbers):
    answer = numbers.pop(numbers.index(max(numbers)))
    answer *= numbers.pop(numbers.index(max(numbers)))
    return answer