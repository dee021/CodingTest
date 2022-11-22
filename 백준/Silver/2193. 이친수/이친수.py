arr = [0 for _ in range(90)]
arr[0] = arr[1] = 1
n = int(input())

for i in range(2, n, 1):
    arr[i] = arr[i-1] + arr[i-2]
print(arr[n-1])