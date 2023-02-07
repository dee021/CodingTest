import sys
sys.setrecursionlimit(10**6)

def cnt(r, c):
    if r < 0 or c < 0 or r >= h or c >= w:
        return 0
    if arr[r][c] == 0:
        return 0
    arr[r][c] = 0
    tmp = []
    for i in range(-1, 2):
        for j in range(-1, 2):
            tmp.append(cnt(r+i, c+j))
    return 1 or any(tmp)

while True:
    w, h = map(int, input().split())
    if w == 0 == h:
        break
    arr = [list(map(int, input().split())) for _ in range(h)]
    ans = 0
    i = 0
    while i<h:
        if 1 in arr[i]:
            ans += cnt(i, arr[i].index(1))
        else:
            i += 1
    print(ans)