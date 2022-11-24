def solution(n):
    answer = 1
    while True:
        if 6 * answer / n == int(6 * answer / n):
            return answer
        else:
            answer += 1