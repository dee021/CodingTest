import sys
from collections import deque

ans = 0
n, k = map(int, sys.stdin.readline().split())
arr = deque(map(int, sys.stdin.readline().split()))
arr.reverse()

for i in range(k):
    while arr:
        idx = arr.index(max(arr))
        if arr[0] != max(arr):
            if i == k-1:
                ans = [arr[0], max(arr)]
                arr = 0
                break
            arr[idx] = arr[0]
            arr.popleft()
            break
        else:
            arr.popleft()
    if not arr:
        print(*sorted(ans)) if ans else print(-1)
        break