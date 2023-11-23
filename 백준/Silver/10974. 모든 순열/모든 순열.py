def sol(depth):
    if depth == n:
        print(*res)
        return
    
    for i in range(1, n+1):
        if not visited[i]:
            visited[i] = 1
            res.append(i)
            sol(depth+1)
            res.pop()
            visited[i] = 0

n = int(input())
visited = [0 for _ in range(n+1)]
res = []
sol(0)