from collections import deque

def sol():
    q = deque([[0, 0]])
    while q:
        x, d = q.popleft()
        for dx in dr:
            idx = x + dx
            if idx < n+1 and dogs[idx] == 0:
                if idx == n:
                    return d +1
                q.append([idx, d+1])
                dogs[idx] = d+1
    return -1

n, m, *dr = map(int, input().split())
dogs = [0 for _ in range(n+1)]
for _ in range(m):
    l, r = map(int, input().split())
    dogs[l:r+1] = [-1]*(r-l+1)
print(sol())