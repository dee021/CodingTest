def sol(start, t):
    if all(visited):
        return t

    p = 0
    for i in range(n):
        if not visited[i]:
            visited[i] = 1
            p = max(p, sol(i, t+abs(arr[start]-arr[i])))
            visited[i] = 0
    return p

ans = 0
n = int(input())
arr = list(map(int, input().split()))
visited = [0 for _ in range(n)]
for start in range(n):
    visited[start] = 1
    ans = max(ans, sol(start, 0))
    visited[start] = 0
print(ans)