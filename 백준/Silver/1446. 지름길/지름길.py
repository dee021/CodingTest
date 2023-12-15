def sol(cur, res):
    global ans
    if cur:
        ans = min(ans, g-cur+res)

    for i in range(n):
        if not visited[i]:
            s, e, d = arr[i]
            if s >= cur and e <= g and e-s > d:
                visited[i] = 1
                sol(e, res + s - cur + d)
                visited[i] = 0

n, g = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [0 for _ in range(n)]
ans = g
sol(0,0)
print(ans)