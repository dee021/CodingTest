from collections import deque

def solution(maps):
    w, h = len(maps[0]), len(maps)
    dy, dx = [0,0,1,-1], [1,-1,0,0]
    q = deque([[0,0,1]])
    maps[0][0] = 0
    
    while q:
        y, x, cnt = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < h and 0 <= c < w and maps[r][c]:
                if r == h-1 and c == w -1:
                    return cnt + 1
                maps[r][c] = 0
                q.append([r, c, cnt +1])
    return -1