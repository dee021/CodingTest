from itertools import product as pd

def solution(word):
    d = []
    for i in range(1, 6):
        d.extend(map(''.join, pd(['A', 'E', 'I', 'O', 'U'],repeat = i)))
    return sorted(d).index(word) +1 
