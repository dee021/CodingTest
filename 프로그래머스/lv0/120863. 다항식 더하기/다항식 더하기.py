def solution(polynomial):
    polynomial = polynomial.split(' + ')
    c = sum([int(n) for n in polynomial if n.count('x') == 0])
    
    x = 0
    for p in [n for n in polynomial if n.count('x')]:
        if p == 'x':
            x += 1
        else:
            x += int(p[:-1])
    if x:
        if x-1:
            return '{0}x + {1}'.format(x, c) if c else str(x)+'x'
        return 'x + {1}'.format(x, c) if c else 'x'
    return str(c)