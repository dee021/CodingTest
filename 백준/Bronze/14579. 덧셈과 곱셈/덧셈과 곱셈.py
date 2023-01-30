def sigma(t):
    return t*(t+1)//2

a, b = map(int, input().split())
ans = sigma(a)

for i in range(a+1, b+1):
    ans *= sigma(i)
    ans %= 14579
print(ans)