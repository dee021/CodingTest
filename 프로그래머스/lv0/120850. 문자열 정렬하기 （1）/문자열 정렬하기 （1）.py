def solution(my_string):
    answer = sorted([int(x) for x in my_string if ord(x)<=57])
    return answer