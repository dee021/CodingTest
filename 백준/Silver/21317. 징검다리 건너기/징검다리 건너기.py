from collections import deque

def sol():
    global ans
    q = deque([[0, 0, 0]])
    while q:
        s, e, f = q.popleft()
        if s == n-1:
            ans = min(ans, e)
            continue

        for j in range(2):
            if s + j + 1 <= n-1:
                q.append([s+j+1, e+arr[s][j], f])
        if not f and s + 3 <= n-1:
            q.append([s+3, e+k, 1])

ans = float('inf')
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n-1)]
k = int(input())
sol()
print(ans)