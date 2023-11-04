import sys
input = sys.stdin.readline

def sol():
    l, r = 1, MAX
    while l <= r:
        mid = (l+r)//2
        kids, t = 0, 0
        for j in arr:
            kids += j//mid + bool(j%mid)
        if kids > n:
            l = mid + 1
        else:
            r = mid - 1
    return l

n, m = map(int, input().split())
arr = [int(input()) for _ in range(m)]
MAX = max(arr)
print(sol())