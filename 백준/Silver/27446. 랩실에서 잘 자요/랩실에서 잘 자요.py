n, m = map(int, input().split())
pages = sorted(set(range(1, n+1)) - set(map(int, input().split())))
dp = [7] + [0 for _ in range(len(pages)-1)]

for i in range(1, len(pages)):
    dp[i] = min(dp[i-1] + 7, dp[i-1] + 2*(pages[i]-pages[i-1]))
print(dp[-1] if pages else 0)