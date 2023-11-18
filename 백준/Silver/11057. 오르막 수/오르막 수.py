M = 10007
n = int(input())
arr = [1 for _ in range(10)]

for i in range(n-1):
    for j in range(1, 10):
        arr[j] = (arr[j-1] + arr[j])%M
print(sum(arr)%M)