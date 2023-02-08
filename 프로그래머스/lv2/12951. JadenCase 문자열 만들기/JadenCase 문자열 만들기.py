def solution(s):
    s = s.lower()
    return ' '.join([c.replace(c[0], chr(ord(c[0])-32), 1) if c and c[0].islower() else c for c in s.split(' ')])