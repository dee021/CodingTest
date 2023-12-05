for _ in range(4):
    a, b, c, d, s, p, q, r = map(int, input().split())
    x = set(range(a, c+1)) & set(range(s, q+1))
    y = set(range(b, d+1)) & set(range(p, r+1))
    if x and y:
        if len(x) == 1 and len(y) == 1:
            ans = 'c'
        elif len(x) == 1 or len(y) == 1:
            ans = 'b'
        else:
            ans = 'a'
    else:
        ans = 'd'
    print(ans)
