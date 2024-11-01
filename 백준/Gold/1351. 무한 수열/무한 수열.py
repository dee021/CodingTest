def sol(k):
    if k in a:
        return a[k]
    a[k] = sol(k//p) + sol(k//q)
    return a[k]

n, p, q = map(int, input().split())
a = {0:1, 1:2}
print(sol(n))