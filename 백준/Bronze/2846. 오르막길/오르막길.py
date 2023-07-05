ans, temp = 0,0
n = int(input())
arr = list(map(int, input().split()))
temp = arr[0]

for i in range(n-1):
    temp = min(temp, arr[i])
    if arr[i] >= arr[i+1]:
        ans = max(ans, arr[i]-temp)
        temp = arr[i]
ans = max(ans, arr[-1]-temp)
print(ans)