w, h = map(int, input().split())
r, c = [0,h], [0,w]
for _ in range(int(input())):
    f, v = map(int, input().split())
    if f:
        c.append(v)
    else:
        r.append(v)
r.sort(); c.sort()
ans = 0
for i in range(len(r)-1):
    for j in range(len(c)-1):
        w, h = r[i+1]-r[i], c[j+1]-c[j]
        if w*h > ans:
            ans = w*h
print(ans)