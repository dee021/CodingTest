import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = input().strip()
    cnt = n.lower().count
    g, b = map(cnt, ['g', 'b'])
    print('%s is ' %n, end='')
    if g == b:
        print('NEUTRAL')
    else:
        print(g > b and 'GOOD' or 'A BADDY')