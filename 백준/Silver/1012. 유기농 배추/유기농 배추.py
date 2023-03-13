import sys
sys.setrecursionlimit(10**7)

def chkGroup(lst, x, y):
    global m, n
    if x < 0 or x >= m or y < 0 or y >= n:
        return 0
    if lst[x][y] == 1:
        lst[x][y] = 0
        chkGroup(lst, x-1, y)
        chkGroup(lst, x+1, y)
        chkGroup(lst, x, y-1)
        chkGroup(lst, x, y+1)
        return 1
    return 0


t = int(input())
for i in range(t):
    cnt = 0
    m, n, k = map(int, input().split())
    b = [[0 for _ in range(n)] for _ in range(m)]
    idx = []
    for j in range(k):
        x, y = map(int, input().split())
        b[x][y] = 1
        idx.append([x, y])
    for x, y in idx:
        cnt += chkGroup(b, x, y)
    print(cnt)