for t in range(1, int(input())+1):
    n = int(input())
    price = list(map(int, input().split()))
    for i in range(n):
        del price[price.index(price[i]*4//3)]
    print('Case #{}: {}'.format(t, ' '.join(map(str, price))))