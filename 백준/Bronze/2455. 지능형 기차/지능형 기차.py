from functools import reduce

peo = ans = 0
for _ in range(4):
    peo += reduce(lambda x, y: y - x, list(map(int, input().split())))
    ans = max(ans, peo)
print(ans)