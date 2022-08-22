name = [3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]

def numName(char):
    return name[ord(char)-65]

dp = list(map(numName, list(input())))
for idx, val in enumerate(list(map(numName, list(input())))):
    dp.insert(idx*2+1, val)
while len(dp) != 2:
    for i in range(len(dp)-1):
        dp[i] = int(str(dp[i] + dp[i+1])[-1])
    dp.pop()
print(*dp, sep='')