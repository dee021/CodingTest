ans = 0
for _ in range(2000):
    cost = int(input())
    if cost == -1:
        print(ans)
        break
    ans += cost