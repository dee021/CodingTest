import sys
input = sys.stdin.readline

s, c = map(int, input().split())
arr = []
l, r, t = 1,0,0
for _ in range(s):
    arr.append(int(input()))
    r = max(r, arr[-1])
    t += arr[-1]

while l <= r:
    mid = (l+r) // 2
    cnt = 0
    for i in range(s):
        cnt += arr[i] // mid
    if cnt < c:
        r = mid - 1
    else:
        l = mid + 1
print(t - c*r)