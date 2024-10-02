import sys
input = sys.stdin.readline

for _ in range(int(input())):
    a, b = map(int, input().split())
    # x = a*m, y = a*n => x + y = b <=> n = b/a-m
    if b/a == b//a > 1:
        print(1)
    else:
        print(0)