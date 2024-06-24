from collections import deque

def solution(board):
    n, m = len(board), len(board[0])
    board = list(map(list, board))
    dr = [(0,1), (0,-1), (1,0), (-1,0)]
    for i in range(n):
        for j in range(m):
            if board[i][j] == 'R':
                q = deque([[i, j, 0]])
                board[i][j] = 'V'
                while q:
                    y, x, cnt = q.popleft()
                    for dy, dx in dr:
                        for w in range(1, max(n,m)):
                            r, c = y + w * dy, x + w * dx
                            if 0 <= r < n and 0 <= c < m and board[r][c] == 'D':
                                if 0 <= r - dy < n and 0 <= c - dx < m and board[r - dy][c - dx] == 'G':
                                    return cnt + 1
                                if 0 <= r - dy < n and 0 <= c - dx < m and board[r - dy][c - dx] == '.':
                                    q.append([r - dy, c - dx, cnt + 1])
                                    board[r - dy][c - dx] = 'V'
                                break
                            elif dy and r in [0, n-1] and 0<= c < m and board[r][c] in ['.', 'G']:
                                if board[r][c] == 'G':
                                    return cnt + 1
                                if board[r][c] == '.':
                                    q.append([r, c, cnt + 1])
                                    board[r][c] = 'V'
                                    break
                            elif dx and c in [0, m-1] and 0<= r < n and board[r][c] in ['.', 'G']:
                                if board[r][c] == 'G':
                                    return cnt + 1
                                if board[r][c] == '.':
                                    q.append([r, c, cnt + 1])
                                    board[r][c] = 'V'
                                    break
    return -1