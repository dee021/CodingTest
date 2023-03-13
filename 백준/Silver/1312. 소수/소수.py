a, b, n = map(int, input().split())
a %= b

for _ in range(n):
    ans, a = 10*a // b, 10*a%b
print(ans)