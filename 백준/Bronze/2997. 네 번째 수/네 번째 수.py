arr = list(map(int, input().split()))
arr.sort()
d = min(abs(arr[0]-arr[1]), abs(arr[1]-arr[2]))

for i in range(2):
    if arr[i+1]-arr[i] > d:
        print(arr[i]+d)
        exit(0)
print(arr[-1]+d)