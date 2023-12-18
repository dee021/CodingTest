from math import gcd

def sol(r1, r2):
    arr = [[0 for _ in range(x+1)] for x in range(r2+1)]
    ans = 0
    for r in range(r1, r2+1):
        for k in range(1, r+1):
            g = gcd(r, k)
            n, d = k//g, r//g
            if not arr[d][n]:
                ans += 1
                arr[d][n] = 1
    return ans
print(sol(*map(int, input().split())))