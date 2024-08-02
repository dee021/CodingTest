n, k, p = map(int, input().split())
arr = list(map(int, input().split()))
cnt = 0
for i in range(n):
    tmp = sum(arr[i*k:i*k+k])
    if k - tmp < p:
        cnt += 1
print(cnt)