for _ in range(int(input())):
    f, b = input().split('-')
    t = 0
    for i, n in enumerate(f[::-1]):
        t += (ord(n)-65)*26**i
    print(abs(t-int(b)) <= 100 and 'nice' or 'not nice')