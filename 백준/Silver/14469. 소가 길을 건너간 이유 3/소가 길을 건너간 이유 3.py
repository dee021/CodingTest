c = []
for _ in range(int(input())):
    c.append(list(map(int, input().split())))
c.sort()

ans = sum(c[0])
for a, b in c[1:]:
    ans = a+b if ans <= a else ans+b
print(ans)