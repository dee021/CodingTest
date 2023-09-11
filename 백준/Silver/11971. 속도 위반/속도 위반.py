n, m = map(int, input().split())
limit = [list(map(int, input().split())) for _ in range(n)]
limit = [list(x) for x in zip(*limit)]
for i in range(1,n):
    limit[0][i] = limit[0][i-1] + limit[0][i]
p = [list(map(int, input().split())) for _ in range(m)]
p = [list(x) for x in zip(*p)]
for i in range(1,m):
    p[0][i] = p[0][i-1] + p[0][i]

idx1, idx2 = 0, 0
dis, ans, l = 0,[], 0
while dis < 100:
    x, y = limit[0][idx1], p[0][idx2]
    v, u = limit[1][idx1], p[1][idx2]
    if x < y:
        dis = x
        idx1 += 1
    elif x > y:
        dix = y
        idx2 += 1
    else:
        dis = x
        idx1 += 1; idx2 += 1
    ans.append(0 if v >= u else u-v)
print(max(ans))