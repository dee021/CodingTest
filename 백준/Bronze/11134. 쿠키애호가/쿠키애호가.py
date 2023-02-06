for _ in range(int(input())):
    n, c = map(int, input().split())
    print(n//c + bool(n%c))