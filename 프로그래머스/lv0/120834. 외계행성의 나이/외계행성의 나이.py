def solution(age):
    lst = [chr(x) for x in range(97, 107)]
    answer = ''.join([lst[int(x)] for x in str(age)])
    return answer