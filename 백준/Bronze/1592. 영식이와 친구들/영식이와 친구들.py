n, m, l = map(int, input().split())
p = [0 for _ in range(n)]
idx, ans = 0, 0
while True:
    p[idx] += 1
    if p[idx] == m:
        break
    elif p[idx]%2:
        idx += l
        if idx >= n:
            idx -= n
    else:
        idx -= l
        if idx < 0:
            idx += n
    ans += 1
print(ans)