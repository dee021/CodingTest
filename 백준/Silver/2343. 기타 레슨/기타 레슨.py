def sol():
    l, r = max(arr), sum(arr)
    mid = (l+r)//2
    while l <= r:
        mid = (l+r)//2
        cnt, s = 0, 0
        for i in range(n):
            s += arr[i]
            if s >= mid:
                cnt += 1
                s = 0 if s == mid else arr[i]
            if i == n-1 and s:
                cnt += 1
        if cnt > m:
            l = mid + 1
        else:
            r = mid -1
    return l

n, m = map(int, input().split())
arr = list(map(int, input().split()))
print(sol())