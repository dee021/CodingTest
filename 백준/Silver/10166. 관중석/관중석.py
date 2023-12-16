r1, r2 = map(int, input().split())
degree, ans = set(), 0
for r in range(r1, r2+1):
    delta = 360/r
    theta = 90
    for d in range(r-1):
        theta = (theta + delta) % 360
        if theta not in degree:
            ans += 1
            degree.add(theta)

print(ans+1)