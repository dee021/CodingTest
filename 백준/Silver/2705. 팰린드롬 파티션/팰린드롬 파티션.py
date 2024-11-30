import sys
input = sys.stdin.readline

dp = [0 for _ in range(1001)]
for i in range(1, 1001):
    tmp = 0
    for j in range(i+1):
        if (i-j)%2 == 0:
            tmp += dp[(i-j)//2]
    dp[i] = tmp +1

for _ in range(int(input())):
    print(dp[int(input())])