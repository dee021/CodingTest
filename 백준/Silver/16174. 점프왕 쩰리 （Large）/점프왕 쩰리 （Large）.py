from collections import deque

def sol():
    q = deque([[0,0]])
    
    while q:
        x, y = q.popleft()
        for i in range(2):
            w = arr[y][x]
            r, c = y + w * dy[i], x + w * dx[i]
            if 0 <= r < n and 0 <= c < n and not visited[r][c]:
                if arr[r][c] == -1:
                    return 'HaruHaru'
                visited[r][c] = 1
                q.append([c, r])
    return 'Hing'

dy, dx = [0,1], [1, 0]
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [[0 for _ in range(n)] for _ in range(n)]
print(sol())