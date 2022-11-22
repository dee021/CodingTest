arr = [[0,0] for _ in range(90)]
arr[0] = [0, 1]
arr[1] = [1, 0]
n = int(input())

for i in range(2, n, 1):
    arr[i][0] = sum(arr[i-1])
    arr[i][1] = arr[i-1][0]
print(sum(arr[n-1]))