import math

def solution(w,h):
    gcd = math.gcd(w, h)
    r, c = h//gcd, w//gcd
    cnt = r+c-1
    return w*h - cnt*gcd