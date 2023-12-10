def sol(r, c):
    for i in range(8):
        xx, yy = dx[i], dy[i]
        x, y = c - dx[i], r - dy[i]
        if 0 <= x < 19 and 0 <= y < 19 and state[y][x] == state[r][c]:
            continue
        cnt = 1
        x, y = c + dx[i], r + dy[i]
        arr = [[c+1, r+1]]
        while 0 <= x < 19 and 0 <= y < 19 and state[y][x] == state[r][c]:
            cnt += 1
            arr.append([x+1, y+1])
            x, y = x + xx, y + yy
        if cnt == 5:
            return sorted(arr)[0]
    else:
        return 0

dx, dy = [1,1,1,-1,-1,-1,0,0], [1,-1,0, 1,-1,0, 1,-1]
state = [list(map(int, input().split())) for _ in range(19)]
for r in range(19):
    for c in range(19):
        if state[r][c]:
            res = sol(r, c)
            if res:
                print(state[r][c])
                print(*res[::-1])
                break
    else:
        continue
    break
else:
    print(0)