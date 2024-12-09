def sol(k):
    if k <= 0:
        return 1
    if k in mem:
        return mem[k]
    mem[k] = sol(k//p - x) + sol(k//q - y)
    return mem[k]


n, p, q, x, y = map(int, input().split())
mem = {}
print(sol(n))