while True:
    a, b = map(int, input().split())
    if a == 0 == b:
        break
    n = a//b
    a %= b
    print(n, a, '/', b)