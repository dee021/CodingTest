from collections import deque

def sol():
    ans = 0
    q = deque([[0,0]])
    while q:
        w, h = q.popleft()
        for i in range(4):
            x, y = w+dx[i], h+dy[i]
            if 0 <= x < n and 0 <= y < m and arr[x][y] == 1:
                arr[x][y] = arr[w][h] + 1
                if x == n-1 and y == m-1:
                    return arr[x][y]
                q.append([x, y])

dx, dy = [0,0,1,-1],[1,-1,0,0]
n, m = map(int, input().split())
arr = [list(map(int, input())) for _ in range(n)]
ans = sol()
print(ans)