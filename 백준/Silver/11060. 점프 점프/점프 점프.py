from collections import deque

def sol():
    q = deque([[0, 0]])
    while q:
        idx, cnt = q.popleft()
        for m in range(1,arr[idx]+1):
            if idx+m < n and visited[idx+m]:
                if idx+m == n-1:
                    return cnt+1
                q.append([idx+m, cnt+1])
                visited[idx+m] = 0
    return -1

n = int(input())
arr = list(map(int, input().split()))
visited = [1 for _ in range(n)]
print(sol() if n > 1 else 0)