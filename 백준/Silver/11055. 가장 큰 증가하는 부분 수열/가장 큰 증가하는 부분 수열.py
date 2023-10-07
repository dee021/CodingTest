n = int(input())
arr = list(map(int, input().split()))
dp = [[0,0] for _ in range(n)]
dp[0] = [arr[0], arr[0]] # sum, max(ele)

for i in range(1, n):
    s = 0
    for j in range(i):
        if dp[j][1] < arr[i]:
            s = max(dp[j][0], s)
    dp[i] = [s+arr[i], arr[i]]
print(max([list(x) for x in zip(*dp)][0]))