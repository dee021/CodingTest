n = int(input())
arr = []
for _ in range(n):
    s = set()
    for r in range(5):
        s = s.union([r*7+i for i, c in enumerate(input()) if c == 'X'])
    arr.append(s)

ans = [100,0,0]
for x in range(n-1):
    for y in range(x+1, n):
        dif = len(arr[x]-arr[y]) + len(arr[y]-arr[x])
        if ans[0] > dif:
            ans = [dif, x+1, y+1]
print(*ans[1:])