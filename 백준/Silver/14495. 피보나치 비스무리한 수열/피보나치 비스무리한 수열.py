arr = [1 for _ in range(int(input()))]

for i in range(3,len(arr),1):
    arr[i] = arr[i-1] + arr[i-3]
print(arr[-1])