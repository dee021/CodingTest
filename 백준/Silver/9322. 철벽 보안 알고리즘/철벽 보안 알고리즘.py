for _ in range(int(input())):
    n = int(input())
    k1 = list(input().split())
    k2 = list(input().split())
    k1 = [k2.index(x) for x in k1]
    c = list(input().split())
    print(' '.join([c[k1[i]] for i in range(n)]))