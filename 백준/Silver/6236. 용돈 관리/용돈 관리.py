n, m = map(int, input().split())
arr = [int(input()) for _ in range(n)]

l, r = max(arr), n*10000
while l <= r:
    mid = (r+l)//2
    cnt, cash = 1,0
    for i in range(n):
        if cash + arr[i] > mid:
            cnt += 1
            cash = arr[i]
        else:
            cash += arr[i]
    if cnt > m:
        l = mid +1
    else:
        r = mid -1
print(l)