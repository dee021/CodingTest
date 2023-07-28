import sys
input = sys.stdin.readline

t = 1
while True:
    a, o, b = input().strip().split()
    if o == 'E':
        break
    print('Case {}: {}'.format(t, eval(a+o+b) and 'true' or 'false'))
    t += 1