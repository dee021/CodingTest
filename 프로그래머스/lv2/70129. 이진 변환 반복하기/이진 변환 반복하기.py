def sol(s, l, dep):
    if s == '1':
        return dep, l
    tmp = len(s)
    s = s.replace('0','')
    l += tmp - len(s)
    s = bin(len(s))[2:]
    return sol(s, l, dep+1)

def solution(s):
    return sol(s, 0, 0)