n, k = input().split()
n = int(n)
ans = 0
t_str = lambda x: '0' + str(x) if x < 10 else str(x)

for h in range(n+1):
    for m in range(60):
        for s in range(60):
            if any(x.count(k) for x in list(map(t_str, [h, m, s]))):
                ans += 1
print(ans)