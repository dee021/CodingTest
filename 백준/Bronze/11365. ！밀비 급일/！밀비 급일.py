while True:
    c = input().split()[::-1]
    if c[0] == 'END':
        break
    print(' '.join([x[::-1] for x in c]))