from collections import deque

def solution(maps):
    maps = [list(x) for x in maps]

    def sol(r, c):
        tmp = int(maps[r][c])
        q = deque([[r, c]])
        maps[r][c] = 'X'
        
        while q:
            y, x = q.popleft()
            for i in range(4):
                r, c = y + dy[i], x + dx[i]
                if 0 <= r < h and 0 <= c < w and maps[r][c] != 'X':
                    tmp += int(maps[r][c])
                    maps[r][c] = 'X'
                    q.append([r, c])
        return tmp
    
    w, h = len(maps[0]), len(maps)
    dy, dx = [0,0,1,-1], [1,-1,0,0]
    answer = []
    
    for r in range(h):
        for c in range(w):
            if maps[r][c] != 'X':
                answer.append(sol(r, c))

    return answer and sorted(answer) or [-1]