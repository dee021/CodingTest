from collections import deque

n, w, l = map(int, input().split())
arr = list(map(int, input().split()))
q = deque([0 for _ in range(w)])
ans, i = 0, 0
while i <= n:
    ans += 1
    q.rotate(-1)
    if q[w-1]:
        q[w-1] = 0
    if i == n and not sum(q):
        break
    elif i < n and not q[w-1] and sum(q) + arr[i] <= l:
        q[w-1] = arr[i]
        i += 1
print(ans)