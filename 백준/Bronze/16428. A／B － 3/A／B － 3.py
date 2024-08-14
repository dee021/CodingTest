a, b = map(int, input().split())
m = a//abs(b)*(-1 if b < 0 else 1)
print(m, a - m*b, sep='\n')