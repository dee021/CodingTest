def solution(numbers, k):
    idx = 0
    for _ in range(k):
        answer = numbers[idx]
        idx = (idx+2)%len(numbers)
    return answer