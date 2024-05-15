import sys
from collections import deque
input = sys.stdin.readline

def sol(r, c):
    q = deque([[r, c, 0]])
    arr[r][c] = 0
    while q:
        y, x, cnt = q.popleft()
        t = 0
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < h and 0 <= c < w and arr[r][c] == 'L':
                t += 1
        if not t:
            start.append([y, x])
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < h and 0 <= c < w and arr[r][c] == 'L':
                arr[r][c] = cnt + 1
                q.append([r, c, cnt+1])
    return [y, x]

def checkAns(r, c):
    global ans
    flag = arr[r][c] == 'L'
    q = deque([[r, c, 0]])
    arr[r][c] = 0 if flag else 'L' 
    while q:
        y, x, cnt = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if flag:
                if 0 <= r < h and 0 <= c < w and arr[r][c] == 'L':
                    arr[r][c] = 0
                    q.append([r, c, cnt+1])
            elif 0 <= r < h and 0 <= c < w and arr[r][c] not in ['L', 'W']:
                arr[r][c] = 'L'
                q.append([r, c, cnt+1])
    ans = max(ans, cnt)

dy, dx = [0,0,1,-1], [1,-1,0,0]
h, w = map(int, input().split())
arr = [list(input().strip()) for _ in range(h)]
ans = 0
start = []

for r in range(h):
    for c in range(w):
        if arr[r][c] == 'L':
            start.append(sol(r, c))

for r, c in start:
    checkAns(r, c)
print(ans)