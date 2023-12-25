n, m = map(int, input().split())
arr = list(map(int, input().split()))
l, r = 0, max(arr)*m

while l <= r:
    mid = (l+r)//2
    s = 0
    for i in range(n):
        s += mid//arr[i]
    if s >= m:
        r = mid - 1
    else:
        l = mid + 1
print(l)