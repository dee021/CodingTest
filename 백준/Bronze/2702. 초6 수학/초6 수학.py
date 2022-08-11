import sys

t = int(input())
for i in range(t):
    a, b = map(int, sys.stdin.readline().split())

    m = 2;factor=1
    while m <= a and m <= b:
        if not any([a%m, b%m]):
            factor *= m
            a, b = a//m, b//m
        else:
            m += 1
    print(factor * a * b, factor)
