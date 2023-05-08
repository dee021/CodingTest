def solution(board, k):
    answer = 0
    for i in range(len(board)):
        if i > k:
            break
        for j in range(len(board[0])):
            if i + j > k:
                break
            answer += board[i][j]
    return answer