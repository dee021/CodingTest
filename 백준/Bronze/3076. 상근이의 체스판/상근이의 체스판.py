import math

r, c = map(int, input().split())
a, b = map(int, input().split())
f = 1
black = (('X'*b + '.'*b) * math.ceil(c/2))[:c*b]
white = (('.'*b + 'X'*b) * math.ceil(c/2))[:c*b]

for _ in range(r):
    if f:
        p = black
    else:
        p = white
    for _ in range(a):
        print(p)
    f ^= 1