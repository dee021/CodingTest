from collections import deque

def solution(x, y, n):
    if x == y:
        return 0
    visited = [0 for _ in range(y+1)]
    visited[x] = 1
    q = deque([[x, 0]])
    while q:
        k, cnt = q.popleft()
        for i in [k+n, k*2, k*3]:
            if i == y:
                return cnt +1
            if i < y and not visited[i]:
                visited[i] = 1
                q.append([i, cnt +1])
    return -1