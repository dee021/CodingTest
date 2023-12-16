from math import gcd

r1, r2 = map(int, input().split())
arr = [[0 for _ in range(x)] for x in range(r2+1)]
ans = 0
for r in range(r1, r2+1):
    for k in range(r):
        g = gcd(r, k)
        n, d = k//g, r//g
        
        if not arr[d][n]:
            ans += 1
            arr[d][n] = 1
print(ans)