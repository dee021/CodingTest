import sys

ans = 0; t = 0
a, b, c, d = map(int, sys.stdin.readline().split())

for i in range(24):
    if a > d:
        break
    if t + a <= d:
        t += a
        ans += b
    else:
        t -= c
        if t < 0:
            t = 0
print(ans)