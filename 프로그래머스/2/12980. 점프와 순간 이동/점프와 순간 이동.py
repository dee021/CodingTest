def solution(n):
    if n <= 2:
        return [0,1,1][n]
    
    if n % 2:
        return solution(n-1) +1
    return solution(n//2)