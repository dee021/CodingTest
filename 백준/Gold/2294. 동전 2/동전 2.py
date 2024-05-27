import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coins = sorted(set(int(input()) for _ in range(n)))
dp = [10**5 for _ in range(k+1)]
dp[0] = 0
for i in range(1, k+1):
    for c in coins:
        if c <= i:
            dp[i] = min(dp[i], dp[i-c] +1)
        else:
            break
print(dp[k] != 10**5 and dp[k] or -1)