from collections import deque

ans = 0
q = deque()
n, k = map(int, input().split())
for i, o in enumerate(input().strip()):
    if i > k:
        q.popleft()
    tmp = o == 'H'
    idx, flag = 0, 0
    while not flag and idx < len(q):
        if q[idx] == (tmp^1):
            q[idx] = 2
            ans += 1
            flag = 1
            q.append(2)
            break
        idx += 1
    if not flag:
        q.append(tmp)
print(ans)