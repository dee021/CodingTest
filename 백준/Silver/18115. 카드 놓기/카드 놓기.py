from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
card = [x for x in range(n, 0, -1)]
idx = deque([x for x in range(n)])

for i in range(n):
    if arr[i] == 1:
        tmp = idx.popleft()
    elif arr[i] == 2:
        tmp = idx[1]
        del idx[1]
    else:
        tmp = idx.pop()
    card[tmp] = n - i

print(*card)