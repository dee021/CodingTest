def update(v):
    s = list(d[v])
    i = 0
    while s and i < len(s):
        postv = s[i]
        s.extend([x for x in d[postv]-d[v] if x not in s])
        d[v] = d[v].union(d[postv])
        i += 1

n = int(input())
g = [list(map(int, input().split())) for _ in range(n)]
d = {x:set() for x in range(n)}

for r in range(n):
    for c in range(n):
        if r != c and g[r][c]:
            d[r].add(c)
        
for r in range(n):
    update(r)
    for c in d[r]:
        g[r][c] = 1
    print(*g[r])