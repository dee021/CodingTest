import sys
input = sys.stdin.readline

m, n = map(int, input().split())
arr = sorted(map(int, input().split()), reverse = True)
l, r = 1, arr[0]

while l <= r:
    mid = (l + r) // 2
    cnt = 0; idx = 0
    while idx < n:
        if arr[idx] < mid:
            break
        cnt += arr[idx] // mid
        idx += 1
    if cnt >= m:
        l = mid + 1
    else:
        r = mid - 1
print(r)