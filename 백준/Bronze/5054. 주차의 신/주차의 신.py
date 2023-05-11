for _ in range(int(input())):
    n, *x = list(map(int, [input(), *input().split()]))
    print((max(x) - min(x))*2)