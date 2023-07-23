from collections import deque

def sol(w, h):
    ans = 0
    q = deque([[w, h]])
    while q:
        w, h = q.popleft()
        for i in range(4):
            x, y = w+dx[i], h+dy[i]
            if 0 <= x < n and 0 <= y < m and arr[x][y] != 'X':
                if arr[x][y] == 'P':
                    ans += 1
                arr[x][y] = 'X'
                q.append([x, y])
    return ans

dx, dy = [0,0,1,-1],[1,-1,0,0]
n, m = map(int, input().split())
arr = [list(input()) for _ in range(n)]

for r in range(n):
    for c in range(m):
        if arr[r][c] == 'I':
            ans = sol(r, c)
            print(ans and ans or 'TT')
            exit(0)