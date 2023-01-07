import math

while True:
    b, n = map(int, input().split())
    if b+n == 0:
        break
    a = b**(1/n)
    c, d = math.floor(a), math.ceil(a)
    print(c) if abs(c**n - b) <= abs(d**n -b) else print(d)