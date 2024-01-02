n, k = map(int, input().split())
exp = sorted(map(int, input().split()))
ans = 0

for i in range(n):
    ans += exp[i]*min(i, k)
print(ans)