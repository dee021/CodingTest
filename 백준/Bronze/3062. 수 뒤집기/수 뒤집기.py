for _ in range(int(input())):
    n = input()
    n = int(n) + int(n[::-1])
    if str(n) == str(n)[::-1]:
        print('YES')
    else:
        print('NO')