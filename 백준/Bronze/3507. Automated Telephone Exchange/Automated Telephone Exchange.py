ans = 0
ate = int(input())
for i in range(100):
    if ate - i < 100:
        ans += 1
print(ans)