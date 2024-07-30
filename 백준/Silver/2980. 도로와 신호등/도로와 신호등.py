n, l = map(int, input().split())
s, t = 0,0
for _ in range(n):
    d, r, g = map(int, input().split())
    m = d - t
    s += m
    c = s%(r+g)
    if c < r:
        s += r-c
    t = d
print(s + l - d)