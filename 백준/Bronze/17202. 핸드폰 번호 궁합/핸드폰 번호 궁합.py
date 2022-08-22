dp = list(map(int, list(input())))
for idx, val in enumerate(list(map(int, list(input())))):
    dp.insert(idx*2+1, val)
while len(dp) != 2:
    for i in range(len(dp)-1):
        dp[i] = int(str(dp[i] + dp[i+1])[-1])
    dp.pop()
print(*dp, sep='')