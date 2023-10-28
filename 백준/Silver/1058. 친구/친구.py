def sol(p):
    res = 0
    for o in [x for x in range(n) if x != p and x not in frd[p]]:
        for f in list(frd[p]):
            if o in frd[f]:
                res += 1
                break
    return res

n = int(input())
frd = {}
for i in range(n):
    frd[i] = set()
    for j, b in enumerate(input()):
        if b == 'Y':
            frd[i].add(j)
cnt = {}; m = 0
for p in range(n):
    cnt[p] = len(frd[p]) + sol(p)
    m = max(m, cnt[p])
print(m)