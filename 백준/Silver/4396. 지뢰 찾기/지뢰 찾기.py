from collections import deque

def findBomb(y, x):
    q = deque([[y, x]])
    for dy, dx in dr:
        r, c = y + dy, x + dx
        if 0 <= r < n and 0 <= c < n and bomb[r][c] != '*':
            if bomb[r][c] == '0':
                bomb[r][c] = 0
            bomb[r][c] += 1

dr = [[0,1], [0,-1], [1,0], [-1,0], [1,1], [1,-1], [-1,1], [-1,-1]]
n = int(input())
bomb = [list(input().strip().replace('.', '0')) for _ in range(n)]
log = [list(input().strip()) for _ in range(n)]
d = []
flag = 0

for r in range(n):
    for c in range(n):
        if bomb[r][c] == '*':
            findBomb(r, c)
            d.append([r, c])

for r in range(n):
    for c in range(n):
        if log[r][c] == 'x':
            if bomb[r][c] == '*':
                flag = 1
            log[r][c] = bomb[r][c]
if flag:
    for r, c in d:
        log[r][c] = '*'

for r in range(n):
    print(*log[r], sep='')