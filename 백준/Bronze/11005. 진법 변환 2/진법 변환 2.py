conv = {k:chr(k+55) if k>9 else str(k) for k in range(36)}

n, b = map(int, input().split())
ans = ''
for x in range(30, -1, -1):
    if n >= b**x:
        ans += conv[n//b**x]
        n %= b**x
    elif ans:
        ans += '0'
print(ans)