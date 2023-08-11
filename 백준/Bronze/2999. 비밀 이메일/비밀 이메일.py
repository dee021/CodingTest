s = input()
n = len(s)
r, c = sorted([[r, n//r] for r in range(1, n//2+1) if n//r == n/r and r <= n//r], key=lambda x: -x[0])[0]
matrix = [list(x) for x in zip(*[s[r*j:r*j+r] for j in range(c)])]
ans = ''
for i in range(r):
    for j in range(c):
        ans += matrix[i][j]
print(ans)