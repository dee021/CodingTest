import sys
input = sys.stdin.readline

def cnt(y, x):
    for dy, dx in dr:
        r, c = y + dy, x + dx
        if 0 <= r < n and 0 <= c < m and board[r][c] != '*':
            if board[r][c] == '.':
                board[r][c] = 0
            board[r][c] += 1

dr = [[-1,-1], [-1,0], [-1,1], [0, -1], [0, 1], [1, -1], [1,0], [1,1]]

while True:
    n, m = map(int, input().split())
    if n == 0 == m:
        break
    board = [list(input().strip()) for _ in range(n)]
    for r in range(n):
        for c in range(m):
            if board[r][c] == '.':
                board[r][c] = 0
            elif board[r][c] == '*':
                cnt(r, c)
    for r in range(n):
        print(*board[r], sep='')