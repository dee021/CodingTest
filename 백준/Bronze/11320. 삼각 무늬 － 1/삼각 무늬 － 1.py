for _ in range(int(input())):
    a, b = map(int, input().split())
    print((a//b)**2)

# a:b = n:1
# => ans = n + (n-1) + (n-1) + (n-2) + (n-2) + ... + 1 + 1
# = n + n(n-1) = n**2