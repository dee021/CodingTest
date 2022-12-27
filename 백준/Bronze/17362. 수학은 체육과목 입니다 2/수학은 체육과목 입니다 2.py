n = int(input())

if n <= 5:
    print(n)
else:
    n -= 5
    if (n//4)%2:
        print(n%4 + 1)
    else:
        print(5 - (n%4))