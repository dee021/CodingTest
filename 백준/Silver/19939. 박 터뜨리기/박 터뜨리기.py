n, k = map(int, input().split())
if k*(k+1)//2 > n:
    print(-1)
else:
    n -= k*(k+1)//2
    print(k-1 + bool(n%k))