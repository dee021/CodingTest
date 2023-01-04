for _ in range(int(input())):
    m, n, x, y = map(int, input().split())
    ans, q, s = min(x, y), min(x, y), max(x, y)
    (p, r) = (m, n) if q == x else (n, m)
    while q != s:
        if ans > m*n:
            ans = -1
            break
        ans += p
        q = (q + p)%r
        if q == 0:
            q = r
    print(ans)