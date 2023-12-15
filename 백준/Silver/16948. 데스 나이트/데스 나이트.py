from collections import deque

def sol(start_row, start_col, end_row, end_col):
    if start_row == end_row and start_col == end_col:
        return 0
    
    q = deque([[start_row, start_col, 0]])
    visited[start_row][start_col] = 1
    while q:
        y, x, cnt = q.popleft()
        for i in range(6):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < n and 0 <= c < n and not visited[r][c]:
                if r == end_row and c == end_col:
                    return cnt +1
                visited[r][c] = 1
                q.append([r, c, cnt + 1])
    return -1

dx, dy = [-1,1,-2,2,-1,+1], [-2,-2,0,0,2,2]
n = int(input())
visited = [[0 for _ in range(n)] for _ in range(n)]
print(sol(*map(int, input().split())))