conv = lambda x: 'BOJ'.index(x)

n = int(input())
arr = list(map(conv, input().strip()))
dp = [float('inf') for _ in range(n)]
dp[0] = 0

for i in range(n):
    cur = arr[i]
    for j in range(i):
        b = arr[j]
        if (b + 3)%3 == cur -1 or (not cur and b == 2):
            dp[i] = min(dp[i], dp[j] + (i-j)**2)
        
print(dp[n-1] if dp[n-1] != float('inf') else -1)