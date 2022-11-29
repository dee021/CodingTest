def solution(keyinput, board):
    w, h = (board[0]-1)//2, (board[1]-1)//2
    answer = [0, 0]
    for d in keyinput:
        if d == "left":
            answer[0] = max(answer[0]-1, -1*w)
        elif d == "right":
            answer[0] = min(answer[0]+1, w)
        elif d == "up":
            answer[1] = min(answer[1]+1, h)
        else:
            answer[1] = max(answer[1]-1, -1*h)
    return answer