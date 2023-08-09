def solution(n):
    b = list(bin(n)[2:]).count
    for k in range(n+1, int('1'*len(bin(n)[2:]),2)+1):
        if bin(k).count('1') == b('1'):
            return k
    return int('1'+'0'*(b('0')+1)+'1'*(b('1')-1), 2)
