c = [350.34, 230.90, 190.55, 125.30, 180.90]
for _ in range(int(input())):
    ans = 0
    for i, e in enumerate(map(int, input().split())):
        ans += c[i]*e
    print('$%0.2f' %ans)