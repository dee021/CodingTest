import operator
for _ in range(int(input())):
    c, b = map(int, input().split())
    t = []; ans = 0
    for _ in range(b):
        t.append(operator.mul(*map(int, input().split())))
    for i in sorted(t, reverse=True):
        if c <= 0:
            break
        c -= i
        ans += 1
    print(ans)