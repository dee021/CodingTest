n, l, d = map(int, input().split())
m = n*l + (n-1)*5
t, b = 0, 0
while t < m:
    t += l
    while b < t:
        b += d
    if t <= b < t+5:
        print(b)
        break
    t += 5
else:
    print(b)