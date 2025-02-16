from math import factorial as ft
from math import floor
import sys
input = sys.stdin.readline

def sol(s, o):
    res = ''
    while s:
        idx = floor((o-0.01)/ft(len(s)-1))
        if idx >= len(s):
            return "No permutation"
        res += s.pop(idx)
        o %= ft(len(s))
        if not o:
            o += ft(len(s))
    return res

while True:
    try:
        s, o = input().split()
    except:
        break
    res = sol(list(s), int(o))
    print('{} {} = {}'.format(s, o, res))