ans = 0
cow = {}

for _ in range(int(input())):
    c, l = map(int, input().split())
    if c in cow:
        ans += cow[c] != l
    cow[c] = l
print(ans)