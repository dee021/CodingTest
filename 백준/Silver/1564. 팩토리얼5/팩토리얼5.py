M = 10**12
ans = 1
n = int(input())
for i in range(2, n+1):
    ans *= i
    while i%5 == 0:
        ans //= 10
        i //= 5
    ans %= M
print('%05d' %(ans%10**5))