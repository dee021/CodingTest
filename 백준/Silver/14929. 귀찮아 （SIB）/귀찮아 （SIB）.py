input()
x = 0; ans = 0
for b in map(int, input().split()):
    ans += x*b
    x += b
print(ans)