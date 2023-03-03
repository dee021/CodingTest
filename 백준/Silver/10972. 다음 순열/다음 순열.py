def swap(a, b):
    tmp = arr[a]
    arr[a] = arr[b]
    arr[b] = tmp

n = int(input())
arr = list(map(int, input().split()))

if n == 1:
    print(-1)
    exit(0)
    
for i in range(n-1, 0, -1):
    if arr[i-1] < arr[i]:
        for j in range(n-1, i-1, -1):
            if arr[i-1] < arr[j]:
                swap(i-1, j)
                break
        print(*arr[:i], *sorted(arr[i:]))
        break
    if i == 1:
        print(-1)