def solution(numbers):
    return sum(set([x for x in range(10)])-set(numbers))