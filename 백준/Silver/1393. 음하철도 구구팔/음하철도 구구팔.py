from math import gcd

def distance(x, y):
    return (sx - x)**2 + (sy - y)**2

sx, sy = map(int, input().split())
ex, ey, dx, dy = map(int, input().split())
if dx and dy:
    g = gcd(dx, dy)
    dx //= g; dy //= g
elif dx == 0:
    dy //= abs(dy)
else:
    dx //= abs(dx)

dis, ans = distance(ex, ey), [ex, ey]
while (res := distance(ex + dx, ey + dy)) < dis:
    dis = res
    ex += dx; ey += dy
    ans = [ex, ey]
print(*ans)