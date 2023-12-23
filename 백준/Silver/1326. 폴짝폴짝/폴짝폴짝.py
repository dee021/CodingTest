from collections import deque
import sys
input = sys.stdin.readline

def sol(a, b):
    if a == b:
        return 0
    
    q = deque([[a-1, 0]])
    visited[a-1] = 1
    while q:
        idx, cnt = q.popleft()
        if arr[idx] == 1:
            return cnt + 1
        post = idx%arr[idx]
        while 0 <= post < n:
            if visited[post]:
                post += arr[idx]
                continue
            visited[post] = 1
            q.append([post, cnt +1])
            if post == b -1:
                return cnt + 1
            post += arr[idx]
    return -1


n = int(input())
arr = list(map(int, input().split()))
visited = [0 for _ in range(n)]
print(sol(*map(int, input().split())))