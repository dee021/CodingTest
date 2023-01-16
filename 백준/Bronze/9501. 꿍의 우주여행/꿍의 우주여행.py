for _ in range(int(input())):
    n, d = map(int, input().split())
    ans = 0
    for i in range(n):
        v, f, c = map(int, input().split())
        t = d/v
        if c*t <= f:
            ans += 1
    print(ans)