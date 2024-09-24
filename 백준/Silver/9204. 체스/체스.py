from collections import deque
import sys
input = sys.stdin.readline

def bfs(start, target):
    q = deque([[start, 0]])
    visited[start] = start
    if start == target:
        return 0
    while q:
        x, cnt = q.popleft()
        for dx in dr:
            if x%8 == 0 and dx in [-9, 7]:
                continue
            if x%8 == 7 and dx in [-7, 9]:
                continue
            w = 1
            while 0 <= x + dx * w < 64:
                post = x + dx * w
                if 0 <= post < 64 and visited[post] == -1:
                    visited[post] = x
                    if post == target:
                        return cnt +1
                    q.append([post, cnt+1])
                if post%8 in [0, 7]:
                    break
                w += 1
    return -1

def path(node):
    if visited[node] == node:
        print(' '+index[node], end='')
        return
    path(visited[node])
    print(' '+index[node], end='')

dr = [-9, -7, 7, 9]
conv = lambda x: ord(x)-ord('A') if x.isalpha() else ord(x)-ord('1')

index = {8*x+y:chr(x+ord('A')) + ' ' + chr(y+1+ord('0')) for x in range(8) for y in range(8)}
for _ in range(int(input())):
    visited = [-1 for _ in range(8*8)]
    start_c, start_r, end_c, end_r = map(conv, input().split())
    start = 8*start_c + start_r
    target = 8*end_c + end_r
    res = bfs(start, target)
    if 0 <= res < 5:
        print(res, end='')
        path(target)
        print()
    else:
        print('Impossible')