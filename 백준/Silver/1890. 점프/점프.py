from collections import deque

def find_path():
    q = deque([[0,0]])
    while q:
        y, x = q.popleft()
        for dx, dy in v:
            c, r = x + arr[y][x]*dx, y + arr[y][x]*dy
            if 0 <= r < n and 0 <= c < n:
                visited[r][c].append([y, x])
                if len(visited[r][c]) == 1 and arr[r][c]:
                    q.append([r, c])

def find_ans(r, c):
    if cnt_path[r][c]:
        return cnt_path[r][c]
    
    cnt = 0
    for y, x in visited[r][c]:
        if not y and not x:
            return 1
        cnt += find_ans(y, x)
    cnt_path[r][c] = cnt
    return cnt

v = [[0,1],[1,0]]
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [[[] for _ in range(n)] for _ in range(n)]
cnt_path = [[0 for _ in range(n)] for _ in range(n)]
find_path()
print(find_ans(n-1, n-1))

'''
시간초과 코드

def sol():
    global ans
    s = [[0,0]]
    while s:
        x, y = s.pop()
        for dx, dy in v:
            r, c = x + arr[x][y]*dx, y + arr[x][y]*dy
            if 0 <= r < n and 0 <= c < n:
                if arr[r][c] == 0:
                    ans += 1
                else:
                    s.append([r, c])

v = [[0,1],[1,0]]
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = 0
sol()
print(ans)
'''