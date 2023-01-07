import math

a, b = map(int, input().split(':'))
gcd = math.gcd(a, b)
print('{}:{}'.format(a//gcd, b//gcd))