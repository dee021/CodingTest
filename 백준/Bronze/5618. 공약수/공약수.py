from functools import reduce
import math

input()
gcd = list(map(int, input().split()))
gcd = reduce(lambda x, y: math.gcd(x, y), gcd)
p = [x for x in range(1, gcd+1) if gcd%x == 0]
print(*p, sep='\n')
