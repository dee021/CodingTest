for t in range(int(input())):
    n = input().split()[1]
    try:
        o = int(n, 8)
    except:
        o = 0
    print(t+1, o, int(n), int(n, 16))