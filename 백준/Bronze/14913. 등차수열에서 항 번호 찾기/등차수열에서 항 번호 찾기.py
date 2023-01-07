a, d, k = map(int, input().split())
if d > 0 and not (a <= k <= 1000000):
    print('X')
    exit(0)
elif d < 0 and not (a >= k >= -1000000):
    print('X')
    exit(0)
ans = (k - a)/d+1
print(int(ans) if int(ans) == ans else'X')