import math

for _ in range(int(input())):
    f = str(math.factorial(int(input())))[::-1]
    f = f.lstrip('0')
    print(f[0])