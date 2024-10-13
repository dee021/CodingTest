import sys
input = sys.stdin.readline
import math

n, l = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
arr.sort()
cur, ans, cnt = 0, 0, 0
for i in range(n):
    if cur < arr[i][0]:
        cur = arr[i][0]
    dis = arr[i][1] - cur
    cnt = math.ceil(dis/l)
    cur += l*cnt
    ans += cnt
print(ans)