def sol(y, x):
    cnt = 0
    for i in range(4):
        xx, yy = x+dx[i], y+dy[i]
        if 0 <= xx < c and 0 <= yy < r and arr[yy][xx] == 'X':
            cnt += 1
    if 4 - cnt < 3:
        d.append([y, x])

dx, dy = [1,-1,0,0], [0,0,1,-1]
r, c = map(int, input().split())
arr = [list(input()) for _ in range(r)]
d = []
for i in range(r):
    for j in range(c):
        if arr[i][j] == 'X':
            sol(i, j)
t = [list(x) for x in zip(*d)]
min_c, max_c, min_r = min(t[1]), max(t[1]), t[0][0]
ans = [['.' for _ in range(max_c-min_c+1)] for _ in range(t[0][-1]-min_r+1)]
for y, x in d:
    ans[y-min_r][x-min_c] = 'X'

for r in range(len(ans)):
    print(''.join(ans[r]))