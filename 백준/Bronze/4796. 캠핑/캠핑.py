n = 0
while True:
    n += 1
    l, p, v = map(int, input().split())
    if not l+p+v:
        break
    ans, v= v//p * l, v%p
    print('Case {0}: {1}'.format(n, ans+min(v, l)))