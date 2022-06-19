import sys
k = int(input())

for i in range(k):
    n, m = map(int, sys.stdin.readline().split())

    num = 1
    den = 1

    for j in range(n,0,-1):
        den = den * j

    while n:
        num = num * m
        n = n - 1
        m = m - 1

    print(int(num/den))