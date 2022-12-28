for _ in range(int(input())):
    n = bin(int(input()))[:1:-1]
    print(*[x for x in range(len(n)) if n[x] == '1'])