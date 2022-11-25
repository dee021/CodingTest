def solution(numbers):
    answer = -1 * 10000**2
    for idx, x in enumerate(numbers):
        for y in numbers[idx+1:]:
            answer = max(answer, x*y)
    return answer