def sol(res):
    global ans
    if len(res) == l:
        if int(res) < b:
            ans = max(ans, int(res))
        return
    
    for i in range(l):
        if not visited[i] and (res or a[i] != '0'):
            visited[i] = 1
            sol(res + a[i])
            visited[i] = 0

a, b = input().split()
a, l, b = list(a), len(a), int(b)
visited = [0 for _ in range(l)]
ans = -1
sol('')
print(ans)