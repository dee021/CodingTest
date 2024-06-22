d = {x:str(x) if x < 10 else chr(ord('A') + x - 10) for x in range(17)}

def conv(k, n):
    tmp = ''
    while k >= n:
        tmp += d[k%n]
        k //= n
    return (tmp + d[k])[::-1]

def solution(n, t, m, p):
    res = ''.join([conv(x, n) for x in range(10**6)])
    return res[p-1::m][:t]