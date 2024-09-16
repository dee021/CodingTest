def sol(y, x):
    visited[y][x] = 0
    flag = 1
    while flag:
        flag = 0
        for index in path:
            dy, dx = dr[index]
            while 0 <= y + dy < n and 0 <= x + dx < m and visited[y + dy][x + dx] == -1:
                flag = 1
                visited[y + dy][x + dx] = visited[y][x] +1
                y += dy; x += dx
    return y, x

dr = [[], [-1,0], [1,0], [0,-1], [0,1]]
n, m = map(int, input().split())
visited = [[-1 for _ in range(m)] for _ in range(n)]
k = int(input())
for _ in range(k):
    r, c = map(int, input().split())
    visited[r][c] = 'X'
r, c = map(int, input().split())
path = list(map(int,input().split()))
print(*sol(r, c))