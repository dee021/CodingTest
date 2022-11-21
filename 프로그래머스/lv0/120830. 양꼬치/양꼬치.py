def solution(n, k):
    answer = 12 * n + 2 * (k - (n//10))
    return answer * 1000