ans = 0
n = int(input())
for f in map(int, input().split()):
    ans += min(n, f)
print(ans)