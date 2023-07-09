n = int(input())
arr = sorted(map(int ,input().split()))
ans = 200000
for i in range(n):
    if ans > arr[i] + arr[2*n-i-1]:
        ans = arr[i] + arr[2*n-i-1]
print(ans)