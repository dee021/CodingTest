from decimal import Decimal

a, b, c = map(Decimal, input().split())
print(int(max(a/b*c, a*b/c)))