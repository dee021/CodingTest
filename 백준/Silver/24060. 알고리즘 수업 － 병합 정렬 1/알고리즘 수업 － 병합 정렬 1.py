import sys
input = sys.stdin.readline

def merge_sort(p, r):
    if p < r:
        q = (p+1 + r+1)//2
        merge_sort(p, q -1)
        merge_sort(q, r)
        merge(p, q -1, r)

def merge(p, q, r):
    global k, ans
    i, j, t = p, q+1, p
    while i <= q and j <= r:
        if arr[i] <= arr[j]:
            tmp[t] = arr[i]
            t += 1
            i += 1
        else:
            tmp[t] = arr[j]
            t += 1
            j += 1
    while i <= q:
        tmp[t] = arr[i]
        t += 1
        i += 1
    while j <= r:
        tmp[t] = arr[j]
        t += 1
        j += 1
    i, t = p, p
    while i <= r and k > 0:
        arr[i] = tmp[t]
        k -= 1
        if k == 0:
            ans = arr[i]
        i += 1
        t += 1

ans = -1
n, k = map(int, input().split())
tmp = [0 for _ in range(n)]
arr = list(map(int, input().split()))
merge_sort(0, n-1)
print(ans)