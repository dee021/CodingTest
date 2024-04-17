def conv(num):
    cnt = 0
    while num >= 5:
        cnt += num//5
        num //= 5
    return cnt

ans = float('inf')
m = int(input())
l, r = 0, 10**9
while l <= r:
    mid = (l + r)//2
    cnt = conv(mid)
    if cnt == m:
        ans = min(ans, mid)
    if cnt < m:
        l = mid +1
    else:
        r = mid -1
print(ans!=float('inf') and ans or -1)