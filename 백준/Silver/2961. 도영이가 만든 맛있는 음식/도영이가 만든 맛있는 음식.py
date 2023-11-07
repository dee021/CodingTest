def sol(idx, res1, res2):
    global ans
    if res2 and abs(res1-res2) < ans:
        ans = abs(res1-res2)
    
    for i in range(idx, n):
        if not visited[i]:
            visited[i] = 1
            sol(i, res1*arr[i][0], res2+arr[i][1])
            visited[i] = 0

ans = 1000000000
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [0 for _ in range(n)]
sol(0,1,0)
print(ans)