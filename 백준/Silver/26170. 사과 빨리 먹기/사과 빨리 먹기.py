def sol(y, x, dis = 0, cnt = 0):
    cnt += arr[y][x]
    if cnt == 3:
        return dis
    res = float('inf')
    for dy, dx in dr:
        r, c = y + dy, x + dx
        if 0 <= r < 5 and 0 <= c < 5 and arr[r][c] != -1 and visited[r][c] == 0:
            visited[r][c] = 1
            tmp = sol(r, c, dis +1, cnt)
            if tmp > 0:
                res = min(res, tmp)
            visited[r][c] = 0
    return res != float('inf') and res or -1
    

dr = [[0,1], [0,-1], [1, 0], [-1, 0]]
visited = [[0 for _ in range(5)] for _ in range(5)]
arr = [list(map(int, input().split())) for _ in range(5)]
r, c = map(int, input().split())
visited[r][c] = 1
print(sol(r, c))