m = 0
f = n = int(input())
p = list(map(int, input().split()))
ans = [0 for _ in range(n)]

for t in range(1, 101):
    s = e = 0
    for i in range(n):
        if p[i] >= t:
            s += 1
        if p[i] == t:
            ans[i] = m+s
            e += 1
    m += f
    f -= e
    
print(*ans)