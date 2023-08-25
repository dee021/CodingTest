n = int(input())
ans = []
for k in range(1, n+1):
    arr = [n, k]
    while arr[-2] - arr[-1] >= 0:
        arr.append(arr[-2] - arr[-1])
    if len(arr) > len(ans):
        ans = arr
print(len(ans))
print(*ans)