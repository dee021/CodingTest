for _ in range(int(input())):
    print(1 if sum(map(int, input().split())) != 1 else 2)