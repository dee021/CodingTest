import sys
input = sys.stdin.readline
from fractions import Fraction

for _ in range(int(input())):
    value = input().strip().strip(')')[2:].split('(')

    if len(value) == 1:
        ans = Fraction(int(value[0]), 10**len(value[0]))
    else:
        tmp = ''.join(value)
        ans = Fraction(int(tmp) - int(value[0] if value[0] else 0), 10**len(tmp) - 10**len(value[0]))
    print(ans)