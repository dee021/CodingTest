n, l = map(int, input().split())

while l < 101:
    ans = n - sum(range(l))
    ans //= l
    
    if ans < 0:
        print(-1)
        exit(0)
    if ans*l + sum(range(l)) == n:
        print(*range(ans, ans+l), sep=' ')
        exit(0)
    else:
        l += 1
print(-1)