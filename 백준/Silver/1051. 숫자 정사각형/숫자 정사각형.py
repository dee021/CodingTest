n, m = map(int, input().split())
arr = [[] for _ in range(10)]
ans = 1

for r in range(n):
    for c, v in enumerate(list(map(int, input()))):
        arr[v].append([r, c])
for r in range(10):
    if len(arr[r]) >= 4:
        for i, [sr, sc] in enumerate(arr[r]):
            if i == len(arr[r])-1:
                break
            for er, ec in arr[r][i+1:]:
                if sr == er or sc == ec:
                    l = abs(sc-ec) if sr == er else abs(sr-er)
                    if arr[r].count([sr+l, sc]) and arr[r].count([sr+l, sc+l]) and arr[r].count([sr, sc+l]):
                        ans = max(ans, (l+1)**2)
print(ans)