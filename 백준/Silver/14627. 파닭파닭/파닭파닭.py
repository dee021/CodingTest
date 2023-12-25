import sys
input = sys.stdin.readline

s, c = map(int, input().split())
arr = [int(input()) for _ in range(s)]
t = sum(arr)
l, r = 1, max(arr)
while l <= r:
    mid = (l+r) // 2
    cnt, last = 0, 0
    for i in range(s):
        cnt += arr[i] // mid
        last += arr[i] % mid
    if cnt < c:
        r = mid - 1
    else:
        l = mid + 1
print(t - c*r)