def solution(n,a,b):
    answer = 1
    a, b = min(a, b), max(a, b)
    while not (a%2 and a+1 == b):
        answer += 1
        a = (a+1)//2 if a%2 else a//2
        b = (b+1)//2 if b%2 else b//2
    return answer