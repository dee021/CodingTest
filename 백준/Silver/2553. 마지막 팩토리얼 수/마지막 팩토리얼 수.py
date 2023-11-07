n = int(input())
ans = 1
M = 10**7

for i in range(1, n+1):
    ans *= i
    while i % 5 == 0:
        ans //= 10
        i //= 5
    ans %= M
print(ans%10)