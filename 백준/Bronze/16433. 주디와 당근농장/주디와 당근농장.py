from collections import deque

def sol(r, c):
    q = deque([[r, c]])
    while q:
        x, y = q.popleft()
        for i in range(4):
            r, c = x+dx[i], y+dy[i]
            if 0 <= r < n and 0 <= c < n and arr[r][c] == '.':
                arr[r][c] = 'v'
                q.append([r, c])

dx, dy = [1,1,-1,-1], [1,-1,1,-1]
n, r, c = map(int, input().split())
arr = [['.' for _ in range(n)] for _ in range(n)]
sol(r, c)
print(*[''.join(x) for x in arr], sep='\n')