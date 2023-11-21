from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = list(map(int, input().split()))
lion = deque([])
ans = n
for i in range(n):
    if arr[i] == 1:
        lion.append(i)
        if len(lion) > k:
            lion.popleft()
        if len(lion) == k:
            ans = min(ans, lion[-1] - lion[0] + 1)
print(ans if len(lion) == k else -1)