ans = 0
a, b = input().split()
a = [a.count(str(x)) for x in range(0, 10)]
b = [b.count(str(x)) for x in range(0, 10)]
for i, x in enumerate(a):
    for j, y in enumerate(b):
        ans += i*j*x*y
print(ans)