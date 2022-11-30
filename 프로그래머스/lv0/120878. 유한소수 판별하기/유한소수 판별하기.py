from fractions import Fraction

def solution(a, b):
    k = 2
    p = set()
    d = Fraction(a, b).denominator
    while d != 1:
        if d%k == 0:
            p.add(k)
            d //=k
        else:
            k +=1
    return [2, 1][0 if p-set([2,5]) else 1]