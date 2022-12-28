ans = 0
for _ in range(int(input())):
    s, a = map(int, input().split())
    ans += a%s
print(ans)