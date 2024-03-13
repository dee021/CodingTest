from collections import deque
import sys
input = sys.stdin.readline

def sol(r, c):
    q = deque([[r, c, 0]])
    arr[r][c] = 1
    
    while q:
        y, x, d = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < n and 0 <= c < m and arr[r][c] != 1:
                q.append([r, c, d + 1])
                if arr[r][c]:
                    print('TAK', d + 1, sep = '\n')
                    return
                arr[r][c] = 1
    print('NIE')
    return
    

dx, dy = [1,-1,0,0], [0,0,-1,1]
n, m = map(int, input().split())
arr = [list(map(int, input().strip())) for _ in range(n)]

for r in range(n):
    for c in range(m):
        if arr[r][c] == 2:
            sol(r, c)
            break