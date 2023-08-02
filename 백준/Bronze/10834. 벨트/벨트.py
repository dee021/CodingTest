from fractions import Fraction

r, f = 1, 0
for _ in range(int(input())):
    a, b, d = map(int, input().split())
    r *= Fraction(b, a)
    f ^= d
print(f, r)