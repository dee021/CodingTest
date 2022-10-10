from decimal import Decimal
d, h, w = map(int, input().split())
t = Decimal((h**2 + w**2)**0.5)
w = Decimal((d * w)/t)
h = Decimal((h * d)/t)
print(int(h), int(w))

# sol)
# 1) x : y = h : w
# <=> x = (y * h) / w
# 2) d**2 = x**2 + y**2
# <=> d**2 = {y**2 * (h**2 + w**2)} / w**2
# ==> x = (h * d)/(h**2 + w**2)**0.5, y = (d * w)/(h**2 + w**2)**0.5
