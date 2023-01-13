while True:
    a, b, c, d = map(int, input().split())
    if a == 0 == b == c == d:
        break
    print(c-b, d-a)