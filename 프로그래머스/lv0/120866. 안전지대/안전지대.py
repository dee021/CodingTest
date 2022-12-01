def solution(board):
    def chValue(r, c):
        for x in range(max(0, r-1), min(r+2, len(board))):
            for y in range(max(0, c-1), min(c+2, len(board))):
                print(x, y)
                if board[x][y] == 0:
                    board[x][y] = 2
    for r, row in enumerate(board):
        for c, e in enumerate(row):
            if e == 1:
                chValue(r, c)
    board = [x.count(0) for x in board]
    return  sum(board)