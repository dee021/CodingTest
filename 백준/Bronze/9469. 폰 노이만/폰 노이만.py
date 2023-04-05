for _ in range(int(input())):
    t, d, a, b, f = map(float, input().split())
    print(int(t), d/(a+b)*f)