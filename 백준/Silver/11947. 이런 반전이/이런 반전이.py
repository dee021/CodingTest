import sys
input = sys.stdin.readline

def f(n):
    l = len(n)-1
    if n[0] >= '5':
        return int('4' + ('9' * l)) * int('5' + ('0' * l))
    return int(n) * (int('9'*(l+1)) - int(n))

for _ in range(int(input())):
    print(f(input().strip()))