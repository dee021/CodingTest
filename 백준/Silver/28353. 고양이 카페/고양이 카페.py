from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
weight = deque(sorted(map(int, input().split())))
ans = 0
while weight:
    l = weight.popleft()
    for i in range(len(weight)-1, -1, -1):
        if weight[i] + l <= k:
            del weight[i]
            ans +=1
            break
print(ans)