while True:
    n = input()
    if n == '0':
        break
    while True:
        n = sum(map(int, n))
        if n < 10:
            print(n)
            break
        else:
            n = str(n)