mi = ma = 1
n = int(input())
dp = [0 for _ in range(n)]
arr = list(map(int, input().split()))
dp[0] = 1

for i in range(1, len(arr)):
    if arr[i] == arr[i-1]:
        mi += 1; ma += 1
    else:
        if arr[i] > arr[i-1]:
            ma += 1
            mi = 1
        else:
            ma = 1
            mi += 1
    dp[i] = max(ma, mi)
print(max(dp))