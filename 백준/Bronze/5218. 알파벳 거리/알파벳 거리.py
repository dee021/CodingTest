for _ in range(int(input())):
    a, b = input().split()
    print('Distances:', *[ord(b[i])-ord(a[i])+(0 if b[i] >= a[i] else 26) for i in range(len(a))])