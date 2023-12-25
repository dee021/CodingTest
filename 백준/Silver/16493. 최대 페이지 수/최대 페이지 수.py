def sol(idx, days, pages):
    global ans
    
    if days > n:
        return
    
    ans = max(ans, pages)
    
    for i in range(idx, m):
        if not visited[i]:
            visited[i] = 1
            sol(i+1, days + ch[i][0], pages + ch[i][1])
            visited[i] = 0

n, m = map(int, input().split())
ch = [list(map(int, input().split())) for _ in range(m)]
visited = [0 for _ in range(m)]
ans = 0
sol(0,0,0)
print(ans)