for i in range(int(input())):
    s = input().split()
    print(' '.join(x[::-1] for x in s))