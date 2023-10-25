def sol(y, x, d):
    global ans
    if d == k and x == c-1 and not y:
        ans += 1
        return
    
    for i in range(4):
        u, v = x + dx[i], y + dy[i]
        if 0 <= u < c and 0 <= v < r and arr[v][u] == '.' and not visited[v][u]:
            visited[v][u] = True
            sol(v, u, d+1)
            visited[v][u] = False

ans = 0
dx, dy = [0,0,1,-1], [1,-1,0,0]
r, c, k = map(int, input().split())
visited = [[False for _ in range(c)] for _ in range(r)]
visited[r-1][0] = True
arr = [list(input()) for _ in range(r)]
sol(r-1, 0, 1)
print(ans)