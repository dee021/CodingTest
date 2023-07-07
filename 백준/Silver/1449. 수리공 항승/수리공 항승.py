from collections import deque

n, l = map(int, input().split())
arr = deque(sorted(map(int, input().split())))
ans = 0
while arr:
    ans += 1
    s = arr[0] - 0.5
    while arr and s <= arr[0] <= s+l:
        arr.popleft()
print(ans)