import math
n = int(input())
f = 0
while math.factorial(f) <= n:f+= 1
for x in range(f, -1, -1):
    if n >= math.factorial(x):
        n -= math.factorial(x)
    if n <= 0:
        break
print('YES' if n==0 and f else 'NO')