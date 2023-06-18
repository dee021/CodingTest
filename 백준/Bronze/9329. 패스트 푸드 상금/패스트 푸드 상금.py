for _ in range(int(input())):
    n, s = map(int, input().split())
    rwd = []
    for _ in range(n):
        a, *b, c = map(int, input().split())
        rwd.append([c, list(map(lambda x: x-1, b))])
    stk = list(map(int, input().split()))
    rwd.sort(key=lambda x: x[0], reverse=True)
    rwd = [list(x) for x in zip(*rwd)]
    ans = 0
    for i in range(n):
        m = min(map(lambda x:stk[x], rwd[1][i]))
        ans += m*rwd[0][i]
        for j in rwd[1][i]:
            stk[j] -= m
    print(ans)