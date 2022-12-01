for _ in range(int(input())):
    r, e, c = map(int, input().split())
    a = e-c
    if r > a:
        print("do not advertise")
    elif r == a:
        print("does not matter")
    else:
        print("advertise")