for _ in range(int(input())):
    c, g = 0, 0
    for i in range(int(input())):
        t, s = map(float, input().split())
        c += t
        g += t*s
    print(int(c), '%0.1f' %(g/c))