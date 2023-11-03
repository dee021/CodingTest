n = int(input())
cnt = [1]
f = 2
while cnt[-1] < n:
    cnt.append(cnt[-1] + f*(f+1)//2)
    f += 1

dp = [float('inf') for x in range(n+1)]
for i in range(n+1):
    for c in cnt:
        if i == c:
            dp[i] = 1
        elif c > i:
            break
        dp[i] = min(dp[i], 1+dp[i-c])
print(dp[n])