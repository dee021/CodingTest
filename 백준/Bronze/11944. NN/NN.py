n, m = input().split()
m = int(m)
print((n*m)[:m] if len(n)*int(n) > m else n*int(n))