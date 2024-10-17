import sys
input = sys.stdin.readline

def sol(a, b):
    while a != b:
        if a > b:
            a //= 2
        else:
            b //= 2
    return a*10

for _ in range(int(input())):
    print(sol(*map(int, input().split())))