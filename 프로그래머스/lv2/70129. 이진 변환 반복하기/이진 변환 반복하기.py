def solution(s):
    l , d = 0, 0
    while s != '1':
        d += 1
        tmp = len(s)
        s = s.replace('0','')
        l += tmp - len(s)
        s = bin(len(s))[2:]
    return [d, l]