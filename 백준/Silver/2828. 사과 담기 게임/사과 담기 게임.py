ans, s = 0, 1
n, m = map(int, input().split())
for _ in range(int(input())):
    a = int(input())
    if s > a:
        ans += s-a
        s = a
    elif a > s+m-1:
        ans += a-s-m+1
        s = a-m+1
print(ans)