from collections import deque

n, k, m = map(int, input().split())
arr = deque(range(1, n+1))
ans = []
flag, cnt = 1, 0

while arr:
    if cnt == m:
        flag ^= 1
        cnt = 0
    if flag:
        arr.rotate(-k+1)
    else:
        arr.rotate(k)
    ans.append(arr.popleft())
    cnt += 1
print(*ans, sep='\n')