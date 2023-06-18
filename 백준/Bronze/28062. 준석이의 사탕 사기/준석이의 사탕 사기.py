n = int(input())

ans = 0;candy = []
for c in map(int, input().split()):
    ans += c
    if c%2:
        candy.append(c)
if len(candy) % 2:
    ans -= min(candy)
print(ans)