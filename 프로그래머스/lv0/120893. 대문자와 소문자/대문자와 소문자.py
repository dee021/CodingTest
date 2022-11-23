def solution(my_string):
    answer = ''
    for c in my_string:
        answer += c.upper() if c.islower() else c.lower()
    return answer