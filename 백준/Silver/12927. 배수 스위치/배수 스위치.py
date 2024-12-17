conv = lambda x: 1 if x == 'Y' else 0

arr = [0] + list(map(conv, input().strip()))
n = len(arr)
ans = 0
for i in range(1, n):
    if arr[i]:
        ans += 1
        for j in range(i, n, i):
            arr[j] ^= 1

print(ans)