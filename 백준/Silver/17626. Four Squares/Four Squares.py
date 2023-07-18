n = int(input())
arr = [0 for _ in range(n+1)]

for k in range(1, n+1):
    if k**0.5 == int(k**0.5):
        arr[k] = 1
        continue
    arr[k] = arr[k-1]
    for s in range(1, int(k**0.5)+1):
        if arr[k] > arr[k-s**2]:
            arr[k] = arr[k-s**2]
    arr[k] += 1     
print(arr[n])