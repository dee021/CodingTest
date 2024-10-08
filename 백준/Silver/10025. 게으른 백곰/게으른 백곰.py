from collections import deque
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
arr = [list(map(int, input().split()))[::-1] for _ in range(n)]
arr.sort()
q = deque()
ans, cnt = 0,0
for idx, g in arr:
    q.append([idx, g])
    cnt += g
    while idx - q[0][0] > 2*k:
        cnt -= q[0][1]
        q.popleft()
    ans = max(cnt, ans)
print(ans)