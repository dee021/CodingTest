t = 0

while True:
    t += 1
    n = int(input())
    if not n:
        break
    if 3*n%2:
        print('{0}. odd {1}'.format(t, (n-1)//2))
    else:
        print('{0}. even {1}'.format(t, n//2))