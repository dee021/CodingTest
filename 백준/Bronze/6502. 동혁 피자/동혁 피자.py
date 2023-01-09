import sys
input = sys.stdin.readline

t = 0
a = ['fits', 'does not fit']
while True:
    t += 1
    n = input().rstrip()
    if n == '0':
        break
    r, w, l = map(int, n.split())
    print('Pizza {} {} on the table.'.format(str(t), a[int((w/2)**2 + (l/2)**2 > r**2)]))