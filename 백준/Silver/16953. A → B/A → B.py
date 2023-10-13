from collections import deque

a, b = map(int, input().split())
q = deque([[a, 1]])
while q:
    k, cnt = q.popleft()
    for n in [k*2, int(str(k)+'1')]:
        if n == b:
            print(cnt + 1)
            exit(0)
        elif n < b:
            q.append([n, cnt + 1])
print(-1)