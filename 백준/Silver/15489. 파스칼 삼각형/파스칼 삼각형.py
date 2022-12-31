import math

ans, f = 0, 0
r, c, w = map(int, input().split())
r -= 1; c -= 1

for n in range(r, r+w):
    f += 1
    for p in range(c, c+f):
        ans += math.factorial(n)/math.factorial(p)/math.factorial(n-p)
print(int(ans))