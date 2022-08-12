import sys
from collections import deque

ans = 0
n, k = map(int, sys.stdin.readline().split())
arr = deque(map(int, sys.stdin.readline().split()))
arr.reverse()

for i in range(k):
    while arr:
        idx = arr.index(max(arr))
        if arr[0] != arr[idx]: 
            if i == k-1:
                ans = [arr[0], arr[idx]]
                arr = 0
                break
            arr[idx] = arr[0]
            arr.popleft()
            break
        else:
            arr.popleft()
    if not arr:
        print(*ans) if ans else print(-1)
        break