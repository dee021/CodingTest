import sys, math

r, g = map(int, input().split())
gcd = math.gcd(r, g)
factor = ['{} {} {}'.format(x, r//x, g//x) for x in range(1,gcd +1) if gcd%x == 0]
sys.stdout.write('\n'.join(factor))