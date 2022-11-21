def solution(slice, n):
    answer = n // slice
    answer += 1 if n % slice else 0
    return answer