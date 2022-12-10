def solution(arr, divisor):
    answer = [x for x in arr if x%divisor == 0]
    if answer:
        return sorted(answer)
    return [-1]