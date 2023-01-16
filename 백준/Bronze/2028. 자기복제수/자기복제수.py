for _ in range(int(input())):
    n = input()
    if str(int(n)**2)[-1*len(n):] == n:
        print('YES')
    else:
        print('NO')