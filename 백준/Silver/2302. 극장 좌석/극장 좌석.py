n = int(input())
ans = 1
dp = [[] for _ in range(n)]
dp[0] = [1,0]
partition = [int(input()) for _ in range(int(input()))]
if n not in partition:
    partition.append(n+1)

for i in range(len(partition)):
    if i:
        l = partition[i] - partition[i-1] - 1
    else:
        l = partition[i] - 1
    if not l:
        continue
    if not dp[l-1]:
        for j in range(l):
            if not dp[j]:
                dp[j] = [sum(dp[j-1]), dp[j-1][0]]
    ans *= sum(dp[l-1])
print(ans)