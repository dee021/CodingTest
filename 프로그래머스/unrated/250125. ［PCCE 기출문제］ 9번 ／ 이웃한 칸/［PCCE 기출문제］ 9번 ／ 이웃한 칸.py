def solution(board, h, w):
    answer = 0
    r, c = len(board), len(board[0])
    dx, dy = [1,-1,0,0], [0,0,-1,1]
    color = board[h][w]
    for i in range(4):
        x, y = w + dx[i], h + dy[i]
        if 0 <= x < c and 0 <= y < r and board[y][x] == color:
            answer += 1
    
    return answer