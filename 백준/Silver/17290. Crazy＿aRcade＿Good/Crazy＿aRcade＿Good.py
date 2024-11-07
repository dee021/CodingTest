from collections import deque

def bfs(y, x):
    if board[y][x] == 0:
        return 0
    board[y][x] = -1
    q = deque([[y, x, 0]])
    while q:
        y, x, dis = q.popleft()
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if 0 <= r < 10 and 0 <= c < 10 and board[r][c] != -1:
                if board[r][c] == 0:
                    return dis +1
                q.append([r, c, dis +1])
                board[r][c] = -1
                
dr = [[0,1], [0,-1], [1,0], [-1,0]]
n, m = map(int, input().split())
board = [[0 for _ in range(10)] for _ in range(10)]
for y in range(10):
    for x, b in enumerate(list(input().strip())):
        if b == 'o':
            for z in range(10):
                board[y][z] = 1
                board[z][x] = 1
print(bfs(n-1, m-1))