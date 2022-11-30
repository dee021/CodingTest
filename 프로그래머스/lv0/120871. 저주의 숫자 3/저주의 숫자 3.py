def solution(n):
    answer = [x for x in range(200) if '3' not in str(x) and x%3]
    return answer[n-1]