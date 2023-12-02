def sol(start):
    cnt = 1
    stack = [start]
    visited[start] = 1
    while stack:
        cur = stack.pop()
        dist = arr[cur]
        for i in [1,-1]:
            post = cur + dist * i
            if 0 <= post < n and visited[post] == 0:
                visited[post] = 1
                stack.append(post)
                cnt += 1
    return cnt

n = int(input())
arr = list(map(int, input().split()))
visited = [0 for _ in range(n)]
print(sol(int(input())-1))