input()
x = 1; ans = 0
for i in map(int, input().split()):
    if i == x:
        x += 1
    else:
        ans += 1
print(ans)