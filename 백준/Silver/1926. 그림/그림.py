from collections import deque

def sol(r, c):
    q = deque([[r,c]])
    cnt = 1
    arr[r][c] = 0
    while q:
        y, x = q.popleft()
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < n and 0 <= c < m and arr[r][c]:
                cnt += 1
                arr[r][c] = 0
                q.append([r, c])
    return cnt

dy, dx = [0,0,1,-1], [1,-1,0,0]
n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = [0]
for i in range(n):
    for j in range(m):
        if arr[i][j]:
            ans.append(sol(i, j))
print(len(ans)-1, max(ans), sep='\n')