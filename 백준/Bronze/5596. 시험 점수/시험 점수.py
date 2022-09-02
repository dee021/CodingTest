ans = 0
for _ in range(2):
    ans = max(ans, sum(map(int, input().split())))
print(ans)