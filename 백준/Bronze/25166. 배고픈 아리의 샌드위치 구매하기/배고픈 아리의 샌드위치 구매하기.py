s, m = map(int, input().split())
if s > 1023:
    if (s-1023)&m >= s-1023:
        print('Thanks')
    else:
        print('Impossible')
else:
    print('No thanks')