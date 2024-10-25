import math
from functools import reduce

def solution(arr):
    answer = reduce(lambda x, y: (x//(g := math.gcd(x, y)))*(y//g)*g, arr)
    return answer