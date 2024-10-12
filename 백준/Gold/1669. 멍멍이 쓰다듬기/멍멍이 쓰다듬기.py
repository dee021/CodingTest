def sol(k):
    if k <= 3:
        return k
    
    for x in range(1, 50000):
        if x**2 < k <= (x+1)**2:
            if k <= (x+1)**2 - x-1:
                return 2*x
            return 2*x+1

x, y = map(int, input().split())
print(sol(y-x))