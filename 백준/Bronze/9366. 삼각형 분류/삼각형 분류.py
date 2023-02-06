for i in range(int(input())):
    a, b, c = sorted(map(int, input().split()))
    print('Case #%d: ' %(i+1), end='')
    if a == c:
        print('equilateral')
    elif a + b <= c:
        print('invalid!')
    elif b in [a, c]:
        print('isosceles')
    else:
        print('scalene')