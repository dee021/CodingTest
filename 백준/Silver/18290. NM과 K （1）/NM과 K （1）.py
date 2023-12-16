def sol(rr, cc, res=0, depth=0):
    global ans
    
    def check(y, x):
        for i in range(4):
            r, c = y + dy[i], x + dx[i]
            if 0 <= r < n and 0 <= c < m:
                if visited[r][c]:
                    return False
        return True

    if depth == k:
        ans = max(ans, res)
        return
    
    for r in range(n):
        for c in range(m):
            if (r > rr or c > cc) and not visited[r][c] and check(r, c):
                visited[r][c] = 1
                sol(r, c, res + arr[r][c], depth + 1)
                visited[r][c] = 0

ans = -float('inf')
dy, dx = [0,0,-1,1], [1,-1,0, 0]
n, m, k = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [[0 for _ in range(m)] for _ in range(n)]
sol(-1,-1)
print(ans)