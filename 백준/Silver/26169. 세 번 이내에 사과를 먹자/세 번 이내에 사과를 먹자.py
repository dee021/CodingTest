def sol(y, x, dis = 0, cnt = 0):
    if cnt == 2:
        return 1
    if dis == 3:
        return 0
    
    apple = board[y][x]
    board[y][x] = -1
    for dy, dx in dr:
        r, c = y + dy, x + dx
        if 0 <= r < 5 and 0 <= c < 5 and board[r][c] >= 0 and dis < 3:
            res = sol(r, c, dis +1, cnt + board[r][c])
            if res:
                return res
    board[y][x] = apple
    return 0

dr = [[0,1], [0,-1], [1,0], [-1,0]]
board = [list(map(int, input().split())) for _ in range(5)]
print(sol(*map(int, input().split())))