def solution(n):
    answer = 1
    fact = 1
    for i in range(1,n+1,1):
        if fact * i <= n:
            answer = i
            fact *= i
        else:
            break
    return answer