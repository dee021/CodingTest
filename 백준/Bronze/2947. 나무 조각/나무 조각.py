ans = [1,2,3,4,5]
arr = list(map(int, input().split()))
i = 0
while arr != ans:
    if arr[i] > arr[i+1]:
        arr[i:i+2] = arr[i+1], arr[i]
        print(*arr)
    i += 1
    if i >= 4:
        i = 0