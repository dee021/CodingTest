from collections import deque

def solution(maps):
    def bfs(s_r, s_c, g_r, g_c):
        visited = [[0 for _ in range(w)] for _ in range(h)]
        visited[s_r][s_c] = 1
        q = deque([[s_r, s_c, 0]])
        while q:
            y, x, cnt = q.popleft()
            for i in range(4):
                r, c = y + dy[i], x + dx[i]
                if 0 <= r < h and 0 <= c < w and maps[r][c] != 'X' and not visited[r][c]:
                    if r == g_r and c == g_c:
                        return cnt + 1
                    visited[r][c] = 1
                    q.append([r, c, cnt + 1])
        return -1
        
        
        
    dy, dx = [0,0,1,-1],[1,-1,0,0]
    d, w, h = {}, len(maps[0]), len(maps)
    for r in range(h):
        for c in range(w):
            if maps[r][c] in ['S', 'L', 'E']:
                d.setdefault(maps[r][c], [r, c])
    ans = bfs(*d['S'], *d['L'])
    if ans == -1:
        return -1
    wer = bfs(*d['L'], *d['E'])
    if wer == -1:
        return -1
    return ans + wer