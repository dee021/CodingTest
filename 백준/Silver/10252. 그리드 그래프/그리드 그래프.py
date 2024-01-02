import sys
input = sys.stdin.readline
print = sys.stdout.write

def sol(r, c):
    print('1\n(0,0)\n')
    for i in range(r):
        if i%2:
            for j in range(c-1, 0, -1):
                print('({},{})\n'.format(i, j))
        else:
            for j in range(1, c):
                print('({},{})\n'.format(i, j))
    print('\n'.join(['({},0)'.format(i) for i in range(r-1, 0, -1)])+'\n')

for _ in range(int(input())):
    r, c = map(int, input().split())
    sol(r, c)