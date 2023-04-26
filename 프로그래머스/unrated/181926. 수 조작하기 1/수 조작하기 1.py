def solution(n, control):
    ctr = {'w':1, 's':-1, 'd':10, 'a':-10}
    return n + sum([ctr[c] for c in control])