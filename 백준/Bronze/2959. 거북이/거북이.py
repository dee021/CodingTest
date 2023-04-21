def sol(a, b, c, d):
    return min(a, b) * min(c, d)
    
a, b, c, d = map(int, input().split())
print(max(sol(a, b, c, d), sol(a, c, b, d), sol(a, d, b, c)))