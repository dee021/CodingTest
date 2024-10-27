import sys
input = sys.stdin.readline

def cnt(i):
    res = 0
    limit = a[i]
    l, r = i+1, n-1
    while l <= r:
        mid = (l+r)//2
        if b[mid] > limit:
            r = mid-1
            continue
        else:
            res = max(res, mid-i)
            l = mid +1
    return res

n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
ans = [0 for _ in range(n)]
for i in range(n):
    ans[i] = cnt(i)
print(*ans)