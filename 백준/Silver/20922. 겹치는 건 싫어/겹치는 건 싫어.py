from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = list(map(int, input().split()))
num, ans, start = {}, 0, -1
for i, m in enumerate(arr):
    num[m] = num.setdefault(m, deque())
    num[m].append(i)
    while len(num[m]) > k:
        start = max(start, num[m].popleft())
    ans = max(ans, i-start)
print(ans)
