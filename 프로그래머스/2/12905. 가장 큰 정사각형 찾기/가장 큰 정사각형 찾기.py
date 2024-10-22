def solution(board):
    answer = max(board[0])
    for r in range(1, len(board)):
        for c in range(1, len(board[0])):
            if board[r][c]:
                board[r][c] = min(board[r-1][c], board[r][c-1], board[r-1][c-1]) +1
                answer = max(answer, board[r][c])
    return answer**2
    
    
    
    
    