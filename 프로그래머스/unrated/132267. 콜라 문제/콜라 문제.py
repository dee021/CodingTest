def solution(a, b, n):
    answer = 0
    while n >= a:
        temp = n//a
        answer += temp*b
        n = n%a + temp*b
    return answer