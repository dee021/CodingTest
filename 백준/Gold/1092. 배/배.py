from bisect import bisect_left
import sys
input = sys.stdin.readline
import math

n = int(input())
arr = list(map(int, input().split()))
arr.sort()

m = int(input())
cnt = [0 for _ in range(n)]
for g in list(map(int, input().split())):
    if g > arr[-1]:
        print(-1)
        exit(0)
    else:
        cnt[bisect_left(arr, g)] += 1

c = cnt[-1]
ans = cnt[-1]
for i in range(n-2, -1, -1):
    c += cnt[i]
    ans = max(ans, math.ceil(c/(n-i)))
print(ans)