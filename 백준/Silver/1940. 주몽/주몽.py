n = int(input())
m = int(input())
arr = sorted(map(int, input().split()))
ans = 0
for i in range(n):
    if arr[i] <= (m-1)//2:
        if m - arr[i] in arr:
            ans += 1
    else:
        break
print(ans)