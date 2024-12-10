import sys
input = sys.stdin.readline

conv = lambda x: int(x) if x.isnumeric() else x

tc = 0
while True:
    o, w = map(int, input().split())
    if o == w == 0:
        break
    tc += 1
    isDead = 0
    while (value := input().strip()) != '# 0':
        a, b = map(conv, value.split())
        if a == 'E':
            w -= b
        else:
            w += b
        if w <= 0:
            isDead = 1
    if isDead:
        ans = 'RIP'
    elif o/2 < w < 2*o:
        ans = ':-)'
    else:
        ans = ':-('
    print(f'{tc} {ans}')