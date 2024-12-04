def solution(n):
    M = 1_000_000_007
    a, b = 1, 1
    for _ in range(n-1):
        a, b = b, (a+b)%M
    return b