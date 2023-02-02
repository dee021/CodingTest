t, car = map(int, [input(),input()])
ans = car
for t in range(t):
    inN, outN = map(int, input().split())
    car += inN - outN
    ans = max(ans, car)
    if car < 0:
        ans = 0
        break
print(ans)