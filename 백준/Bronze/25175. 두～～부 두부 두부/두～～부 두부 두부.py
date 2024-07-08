n, m, k = map(int, input().split())
while  k < 0:
    k += n
ans = m+((k-3)%n)
if ans > n:
    ans %= n
print(ans)