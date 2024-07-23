def sol(n):
    if n == 1:
        return 0
    if n % 2 == 0:
        return n - (n//2)
    
    for i in range(3, n, 2):
        if i**2 > n:
            return n-1
        if n % i == 0:
            return n - (n//i)

n = int(input())
print(sol(n))