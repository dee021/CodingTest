peo = ans = 0
for _ in range(10):
    a, b = map(int, input().split())
    peo += b - a 
    ans = max(ans, peo)
print(ans)