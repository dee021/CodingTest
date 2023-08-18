arr = [[0 for _ in range(1001)] for _ in range(1001)]
n = int(input())
for k in range(1, n+1):
    x, y, w, h = map(int, input().split())
    for i in range(x, x+w):
        for j in range(y, y+h):
            arr[i][j] = n

cnt = [arr[i].count for i in range(1001)]
for k in range(1, n+1):
    ans = 0
    for i in range(1001):
        ans += cnt[i](k)
    print(ans)