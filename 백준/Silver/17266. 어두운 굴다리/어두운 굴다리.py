import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
arr = list(map(int, input().split()))

l, r = 0, n
while l <= r:
    flag = 1
    mid = (l+r) // 2
    cur = 0
    for x in arr:
        if cur < x - mid:
            flag = 0
            break
        cur = x + mid
    if not flag or cur < n:
        l = mid + 1
    else:
        r = mid - 1
print(l)