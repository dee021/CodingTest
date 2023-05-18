n, m, u, t, r = map(int, input().split())
p = m
if m + t > u:
    print(-1)
    exit(0)

ans, s = 0,0
while s < n:
    if p + t <= u:
        p += t; ans += 1; s += 1
    else:
        p = max(p-r, m); ans += 1
print(ans)