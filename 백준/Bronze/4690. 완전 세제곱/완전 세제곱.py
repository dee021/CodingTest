for a in range(2, 101):
    arr = []
    for d in range(2, a):
        for c in range(2, d):
            for b in range(2, c):
                if a**3 == b**3 + c**3 + d**3:
                    arr.append((b, c, d))
    for b, c, d in sorted(arr):
        print('Cube = {0}, Triple = ({1},{2},{3})'.format(a, b, c, d))