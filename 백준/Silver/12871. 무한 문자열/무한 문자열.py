import math

s, t = input(), input()
gcd = math.gcd(len(t), len(s))
print(int(s*(len(t)//gcd) == t*(len(s)//gcd)))