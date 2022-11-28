from fractions import Fraction
ans = Fraction(input().replace(' ', '/')) + Fraction(input().replace(' ', '/'))
print(ans.numerator, ans.denominator)