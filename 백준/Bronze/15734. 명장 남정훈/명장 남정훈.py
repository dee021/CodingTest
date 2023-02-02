l, r, a = map(int, input().split())
if min(l, r) + a >= max(l, r):
    a -= max(l, r)-min(l,r)
    l = r = max(l, r)
    if a%2:
        a -= 1
else:
    l = r = min(l, r) + a
    a = 0
print(min(r, l)*2 + a)