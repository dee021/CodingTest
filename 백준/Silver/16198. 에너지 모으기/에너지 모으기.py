def sol(res = 0, depth = 0):
    global ans

    def cal(i):
        l, r = 0,n-1
        for j in range(n):
            if j < i and not visited[j]:
                l = j
            elif j > i and not visited[j]:
                r = j
                return arr[l]*arr[r]

    if depth == n-2:
        ans = max(ans, res)
        return
    
    for i in range(1, n-1):
        if not visited[i]:
            visited[i] = 1
            sol(res+cal(i), depth + 1)
            visited[i] = 0

n = int(input())
ans = 0
arr = list(map(int, input().split()))
visited = [0 for _ in range(n)]
sol()
print(ans)