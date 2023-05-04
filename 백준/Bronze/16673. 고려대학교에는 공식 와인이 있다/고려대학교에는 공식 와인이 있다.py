c, k, p = map(int, input().split())
s = c*(c+1)//2
print(k*s + p*s*(2*c+1)//3)

# ans = k*sigma(c) + p*sigma(c**2)