M = 1000000007
n = int(input())
code1 = [[1 for _ in range(n+1)]] + [[1 if x == 0 else 0 for x in range(n+1)] for _ in range(n)]

for r in range(1, n+1):
    for c in range(1, n+1):
        code1[r][c] = (code1[r-1][c] + code1[r][c-1])%M

print(code1[n][n], n*n%M)