n = int(input())
arr = list(map(int, input().split()))
dp = [0 for _ in range(n)]
dp[0] = 1

for a in range(1, n):
    for b in range(a):
        if arr[b] > arr[a]:
            dp[a] = max(dp[a], dp[b])
    dp[a] += 1
print(max(dp))