def solution(a, b, c):
    l = len(set([a,b,c]))
    answer = a+b+c
    if l <= 2:
        answer *= a**2 + b**2 + c**2
    if l == 1:
        answer *= a**3 + b**3 + c**3
    return answer