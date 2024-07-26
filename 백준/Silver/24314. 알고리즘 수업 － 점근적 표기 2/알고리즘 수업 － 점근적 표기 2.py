a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())
ans = 1
for n in range(n0, 101):
    if c*n > a1 * n + a0:
        ans = 0
        break
print(ans)