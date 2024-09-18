def solution(numbers):
    numbers = sorted(map(str, numbers), key= lambda x:(x[0], x*3))
    answer = ''.join(numbers[::-1]).lstrip('0')
    if not answer: return '0'
    return answer
