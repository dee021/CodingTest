from functools import reduce

def solution(array):
    answer = reduce(lambda x, y: x+y, [str(n).count('7') for n in array])
    return answer