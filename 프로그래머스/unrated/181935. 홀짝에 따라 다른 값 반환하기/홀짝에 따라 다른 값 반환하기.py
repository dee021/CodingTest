def solution(n):
    ans = [x if n%2 else x**2 for x in range(n%2, n+1, 2)]
    return sum(ans)