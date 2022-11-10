import sys
input = sys.stdin.readline

for i, c in enumerate(input().strip()):
    if (i+1)%10:
        print(c, end='')
    else:
        print(c)