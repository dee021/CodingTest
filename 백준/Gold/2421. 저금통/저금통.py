n = int(input())
prime = [1 if x%2 else 0 for x in range(int(f'{n}{n}')+ 1)]
for p in range(3, len(prime)):
    if not p:
        continue
    if p*p > len(prime):
        break
    k = 3
    while p*k <= len(prime) -1:
        prime[p*k] = 0
        k += 2

dp = [[0 for _ in range(n+1)] for _ in range(n+1)]
for f in range(1, n+1):
    for s in range(1, n+1):
        if f == s == 1:
            continue
        dp[f][s] = max(dp[f-1][s], dp[f][s-1])
        if prime[int(f'{f}{s}')]:
            dp[f][s] += 1
print(dp[n][n])