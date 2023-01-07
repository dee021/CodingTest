for _ in range(int(input())):
    c, v = map(int, input().split())
    print('You get {} piece(s) and your dad gets {} piece(s).'.format(c//v, c%v))