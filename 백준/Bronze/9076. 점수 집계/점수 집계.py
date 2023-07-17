for _ in range(int(input())):
    a, b, c, d, e = sorted(map(int, input().split()))
    print(b + c + d if d-b < 4 else 'KIN')