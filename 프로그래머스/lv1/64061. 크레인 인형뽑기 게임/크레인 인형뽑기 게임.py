def solution(board, moves):
    dep = len(board[0]);bas = [0]
    answer = 0
    for m in moves:
        for d in range(dep):
            if board[d][m-1]:
                if bas[-1] == board[d][m-1]:
                    bas.pop()
                    answer += 2
                else:
                    bas.append(board[d][m-1])
                board[d][m-1] = 0
                break

    return answer