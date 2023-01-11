while True:
    n = input()
    if n == '0':
        break
    while len(n) > 1:
        t = sum(map(int, list(n)))
        n = str(t)
    print(n)