import sys
n, k = map(int, sys.stdin.readline().split())

dp = [[0 for _  in range(k+1)] for _ in range(n)]
# dp[i][j] : 담을 수 있는 무게가 j일때, item[i]까지 탐색한 경우 최대 가치

item = []
for i in range(n):
    item.append(list(map(int, sys.stdin.readline().split())))
    for j in range(k+1):
        if i == 0 and j >= item[0][0]:
            dp[i][j] += item[0][1]
            continue
        dp[i][j] += dp[i-1][j]
        if item[i][0] <= j: # 0 < i < n
            dp[i][j] = max(dp[i][j], dp[i-1][j-item[i][0]]+item[i][1])

print(max(dp[n-1]))