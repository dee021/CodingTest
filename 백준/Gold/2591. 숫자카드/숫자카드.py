s = input().strip()
s = s.replace('10', 'A').replace('20', 'A').replace('30', 'A')
n = len(s)
fibo = [1, 2] + [0 for _ in range(n)]
dp = [1]+[0 for _ in range(n)]
dp[1] = 1
t = 0
for i in range(2, n+1):
    fibo[i] = fibo[i-1] + fibo[i-2]
    if 'A' in s[i-2:i]:
        dp[i] = dp[i-1]
        t = 0
        continue
    if int(s[i-2:i]) <= 34:
        t += 1
    else:
        t = 0
    dp[i] = dp[i-t-1] * fibo[t]
print(dp[n])