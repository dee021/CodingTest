a, b, c, x, y = map(int, input().split())

if a+b > 2*c:
    ans = min(x, y)*2*c
    ans += (y-x)*min(b, 2*c) if x < y else (x-y)*min(a,2*c)
else:
    ans = a*x + b*y
print(ans)