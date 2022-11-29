from functools import reduce

def solution(sides):
    answer = [x for x in range(reduce(lambda x, y: abs(x-y)+1, sides), sum(sides))]
    return len(answer)