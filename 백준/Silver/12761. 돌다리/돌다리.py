from collections import deque

def dfs(cur, target):
    if cur == target:
        return 0
    
    q = deque([[cur, 0]])
    while q:
        cur, cnt = q.popleft()
        for i in range(6):
            post = cur + dx[i]
            if 0<= post <= 100000 and not arr[post]:
                arr[post] = cnt + 1
                q.append([post, cnt +1])
            if q and q[-1][0] == target:
                return cnt +1
        for t in [a, b]:
            post = cur * t
            if 0<= post <= target and not arr[post]:
                arr[post] = cnt + 1
                q.append([post, cnt +1])
            if q and q[-1][0] == target:
                return cnt +1

arr = [0 for _ in range(100001)]
a, b, n, m = map(int, input().split())
dx = [1, -1, a, -a, b, -b]
arr[a] = -1
print(dfs(n, m))