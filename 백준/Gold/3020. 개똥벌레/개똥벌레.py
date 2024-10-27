import sys
input = sys.stdin.readline

w, h = map(int, input().split())
arr = [(h-int(input()), h) if x%2 else (0, int(input())) for x in range(w)]
arr.sort()

cnt, heights = float('inf'), 0
l, r = 0,0
for k in range(h):
    while r+1 < w and arr[r+1][0] <= k < arr[r+1][1]:
        r += 1
    while l <= r and arr[l][1] <= k:
        l += 1
    if cnt > r-l+1:
        cnt = r-l+1
        heights = 1
    elif cnt == r-l+1:
        heights += 1
print(cnt, heights)