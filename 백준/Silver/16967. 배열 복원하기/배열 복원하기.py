h, w, x, y = map(int, input().split())
b = [list(map(int, input().split())) for _ in range(h+x)]
a = [[0 for _ in range(w)] for _ in range(h)]

for r in range(h):
    for c in range(w):
        if r < x or c < y:
            a[r][c] = b[r][c]
        else:
            a[r][c] = b[r][c] - a[r-x][c-y]
    print(*a[r])