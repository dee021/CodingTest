def sol(egg, idx = 0, cnt = 0):
    global ans
    ans = max(ans, cnt)
    if idx >= n:
        return

    while idx < n and egg[idx][0] <= 0:
        idx += 1
        if idx == n:
            return
    
    for i in range(n):
        if i != idx and egg[i][0] > 0:
            egg[idx][0] -= egg[i][1]
            egg[i][0] -= egg[idx][1]
            sol(egg.copy(), idx+1, cnt + (egg[idx][0] <= 0) + (egg[i][0] <= 0))
            egg[idx][0] += egg[i][1]
            egg[i][0] += egg[idx][1]
    return





n = int(input())
eggs = [list(map(int, input().split())) for _ in range(n)]
ans = 0
sol(eggs.copy())
print(ans)