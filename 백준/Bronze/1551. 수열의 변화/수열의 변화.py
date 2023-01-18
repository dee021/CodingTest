n, k = map(int, input().split())
arr = list(map(int, input().split(',')))

for _ in range(k):
    n -= 1
    for i in range(n):
        arr[i] = arr[i+1] - arr[i]
    arr.pop()
print(*arr, sep=',')