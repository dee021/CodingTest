def factorial(n):
    ft[0] = 1
    
    for i in range(1, n+1):
        ft[i] = ft[i-1] * i

M = 1000000007
n, m = map(int, input().split())
ans = 0
ft = [0 for _ in range(n+1)]
factorial(n)
for i in range(n//m+1):
    k = n + i*(1-m)
    ans = (ans + ft[k]//ft[i]//ft[k-i])%M
print(ans)