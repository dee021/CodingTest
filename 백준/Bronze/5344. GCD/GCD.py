import math

for _ in range(int(input())):
    print(math.gcd(*map(int, input().split())))