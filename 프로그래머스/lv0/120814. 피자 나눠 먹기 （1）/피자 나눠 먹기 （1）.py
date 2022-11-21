def solution(n):
    answer = n // 7
    answer += 1 if n % 7 else 0
    return answer