from collections import deque

def sol(x, y):
    q = deque([[x, y, 0]])
    while q:
        x, y, cnt = q.popleft()
        for i in range(8):
            c = x + dr[i][0]
            r = y + dr[i][1]
            if 0 <= r < size and 0 <= c < size and not visited[r][c]:
                if [c, r] == goal:
                    return cnt +1
                q.append([c, r, cnt +1])
                visited[r][c] = 1

dr = [[1, 2], [2, 1], [-1, 2], [-2, 1], [1, -2], [2, -1], [-1, -2], [-2, -1]]

for _ in range(int(input())):
    size = int(input())
    visited = [[0 for _ in range(size)] for _ in range(size)]
    x, y = map(int, input().split())
    visited[y][x] = 1
    goal = list(map(int, input().split()))
    if [x, y] == goal:
        print(0)
    else:
        print(sol(x, y))