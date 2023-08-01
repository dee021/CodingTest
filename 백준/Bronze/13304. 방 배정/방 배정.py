sol = lambda x: x//k + bool(x%k)
n, k = map(int, input().split())
s = [[0,0] for _ in range(3)]

for _ in range(n):
    g, y = map(int, input().split())
    s[(y-1)//2][g] += 1

ans = sol(sum(s[0]))
for a, b in s[1:]:
    ans += sol(a) + sol(b)
print(ans)