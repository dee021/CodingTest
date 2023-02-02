while True:
    a, b, c = sorted(map(int, input().split()))
    if not c:
        break
    elif a == c:
        print('Equilateral')
    elif a + b <= c:
        print('Invalid')
    elif b in [a, c]:
        print('Isosceles')
    else:
        print('Scalene')