n, k = map(int, input().split())

arr = [x for x in range(2, n+1, 1)]

while True:
    p = arr[0]
    for x in arr:
        if x%p == 0:
            arr.remove(x)
            k -= 1
            if k == 0:
                print(x)
                exit(0)