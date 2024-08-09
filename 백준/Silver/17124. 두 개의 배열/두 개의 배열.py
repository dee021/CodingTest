import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = sorted(map(int, input().split()))
    ans = 0
    for i in range(n):
        l, r = 0, m-1
        while l <= r:
            mid = (l+r)//2
            gap = abs(a[i] - b[mid])
            if abs(b[min(m-1,mid+1)] - a[i]) < gap:
                l = mid + 1
            else:
                r = mid - 1
        ans += b[l]
    print(ans)