import math
def solution(array):
    array.sort()
    return array[math.floor(len(array)//2)]