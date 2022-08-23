from decimal import Decimal
a, b = map(int, input().split())
b = Decimal('1')- Decimal(b) * Decimal('0.01')
a = Decimal(a) * b
print(a<100 and 1 or 0)