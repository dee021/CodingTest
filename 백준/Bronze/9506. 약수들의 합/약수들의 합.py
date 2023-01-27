import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if n == -1:
        break
    s = []
    for i in range(1,n//2+1):
        if n%i == 0:
            s.append(i)
    print('{}{}'.format(n, sum(s) == n and ' = ' + ' + '.join(map(str, s)) or ' is NOT perfect.'))