def sol(d1, p, d2, i):
    if d1 == d2:
        return abs(p-i)
    if d1 <= 2 and d2 <= 2:
        dis1, dis2 = p+i, 2*w-p-i
        return min(dis1, dis2) + h
    if d1 >= 3 and d2 >= 3:
        dis1, dis2 = p+i, 2*h-p-i
        return min(dis1, dis2) + w
    t = set([d1, d2])
    if t == set([1,4]): #
        return (p if d2 == 1 else i) + w - (i if d2 == 1 else p)
    elif t == set([4,2]):
        return h-(p if d2 == 2 else i) + w-(i if d2 == 2 else p)
    elif t == set([2,3]): # 
        return (p if d2 == 3 else i) + h - (i if d2 == 3 else p)
    else:
        return p + i

w, h = map(int, input().split())
arr = [[0 for _ in range(w+1)] for _ in range(h+1)]
n = int(input())
for _ in range(n):
    d, p = map(int, input().split())
    if d <= 2:
        arr[h if d == 2 else 0][p] = d
    else:
        arr[p][w if d == 4 else 0] = d
d, p = map(int, input().split())
ans = 0

for r in range(h+1):
    for c in range(w+1):
        if arr[r][c]:
            ans += sol(d, p, arr[r][c], r if arr[r][c] >= 3 else c)
print(ans)