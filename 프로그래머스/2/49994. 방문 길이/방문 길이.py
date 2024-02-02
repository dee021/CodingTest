def solution(dirs):
    idx = 'DURL'.index
    dr = {'U':[-1, 0], 'D':[1, 0], 'R':[0, 1], 'L':[0, -1]}
    maps = [[[0,0,0,0] for _ in range(11)] for _ in range(11)]
    y, x = 5,5
    answer = 0
    for d in dirs:
        dy, dx = dr[d]
        if 0 <= y + dy < 11 and 0 <= x + dx < 11:
            if maps[y][x][idx(d)] == 0:
                maps[y][x][idx(d)] = 1
                maps[y + dy][x + dx][idx(d) + dy + dx] = 1
                answer += 1
            x += dx; y += dy
    return answer