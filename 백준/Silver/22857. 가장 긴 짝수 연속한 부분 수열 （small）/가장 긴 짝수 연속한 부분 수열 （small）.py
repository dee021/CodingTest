import sys
input = sys.stdin.readline

conv = lambda x:int(x)%2
n, k = map(int, input().split())
arr = list(map(conv, input().split()))

l, r, cnt, del_cnt = 0,0,1 - arr[0], arr[0]
ans = cnt
while l <= r < n -1:
    r += 1
    if arr[r]: # odd
        while del_cnt >= k:
            cnt -= arr[l]^1
            del_cnt -= arr[l]
            l += 1
        del_cnt += 1
    else:
        cnt += 1
        ans = max(ans, cnt)
print(ans)