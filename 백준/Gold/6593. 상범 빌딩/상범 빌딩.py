from collections import deque
import sys
input = sys.stdin.readline

def bfs(z, y, x):
    arr[z][y][x] = 0
    q = deque([[z, y, x]])
    while q:
        z, y, x = q.popleft()
        for dz, dy, dx in dr:
            if 0<= z + dz < l and 0 <= y + dy < r and 0 <= x + dx < c and arr[z+dz][y+dy][x+dx] in ['.', 'E']:
                if arr[z+dz][y+dy][x+dx] == 'E':
                    return 'Escaped in {} minute(s).'.format(arr[z][y][x] +1)
                q.append([z+dz, y+dy, x+dx])
                arr[z+dz][y+dy][x+dx] = arr[z][y][x] +1
    return 'Trapped!'

dr = [[1, 0,0], [-1,0,0], [0,1,0], [0,-1,0], [0,0,1], [0,0,-1]]

while True:
    l, r, c = map(int, input().split())
    if l == 0 == r == c:
        break
    ans = ''
    arr = [[] for _ in range(l)]
    for i in range(l):
        arr[i] = [list(input().strip()) for _ in range(r)]
        input()
    
    for z in range(l):
        for y in range(r):
            for x in range(c):
                if arr[z][y][x] == 'S':
                    ans = bfs(z, y, x)
                    break
            if ans:
                break
        if ans:
            break
    print(ans)