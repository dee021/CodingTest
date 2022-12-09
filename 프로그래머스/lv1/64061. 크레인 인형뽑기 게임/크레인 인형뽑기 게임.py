def solution(board, moves):
    board = [list(x) for x in zip(*board)]
    dep = len(board[0]);bas = []
    answer = 0
    for m in moves:
        for d in range(dep):
            if board[m-1][d]:
                if bas and bas[-1] == board[m-1][d]:
                    bas.pop()
                    answer += 2
                else:
                    bas.append(board[m-1][d])
                board[m-1][d] = 0
                break

    return answer