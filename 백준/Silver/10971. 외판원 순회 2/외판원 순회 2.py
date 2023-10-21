def sol(start, t):
    global ans
    if all(visited):
        if w[start][0]:
            return t + w[start][0]
        return 10**7
    if t > ans:
        return 10**7
    
    p = 10**7
    for i in range(1, n):
        if not visited[i] and w[start][i]:
            visited[i] = 1
            p = min(p, sol(i, t+w[start][i]))
            visited[i] = 0
    return p

ans = 10**7
n = int(input())
visited = [0 for _ in range(n)]
visited[0] = 1
w = [list(map(int, input().split())) for _ in range(n)]
print(sol(0, 0))