for _ in range(int(input())):
    c, n = 0, ''
    for _ in range(int(input())):
        a, b = input().split()
        if c < int(a):
            c, n = int(a), b
    print(n)