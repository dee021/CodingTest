peo = ans = 0
for _ in range(4):
    a, b = map(int, input().split())
    peo += b - a 
    ans = max(ans, peo)
print(ans)