import sys
n, m = map(int, sys.stdin.readline().split())

while n and m:
    if (m%n) == 0:
        print('factor')
    elif (n%m) == 0:
        print('multiple')
    else:
        print('neither')
    n, m = map(int, sys.stdin.readline().split())
