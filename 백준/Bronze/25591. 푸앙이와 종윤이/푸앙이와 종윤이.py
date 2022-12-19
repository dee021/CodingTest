a, b = map(int, input().split())
a, b = 100-a, 100-b
c = 100-a-b
d = a * b
q = d // 100
r = d % 100
print(a, b, c, d, q, r)
print(c+q, d < 100 and d or r)