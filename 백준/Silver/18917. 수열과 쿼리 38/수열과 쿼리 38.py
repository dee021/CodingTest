import sys

s, x = 0, 0
n = int(sys.stdin.readline())

for i in range(n):
    oper = list(map(int, sys.stdin.readline().split()))
    if oper[0] == 1:
        s += oper[1]
        x ^= oper[1]
    elif oper[0] == 2:
        s -= oper[1]
        x ^= oper[1]
    elif oper[0] == 3:
        sys.stdout.write(str(s)+'\n')
    else:
        sys.stdout.write(str(x)+'\n')