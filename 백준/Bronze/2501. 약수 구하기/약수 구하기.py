n, k = map(int, input().split())
arr = [x for x in range(1,n+1) if n%x == 0]

print(arr[k-1]) if len(arr)-k >= 0 else print(0)