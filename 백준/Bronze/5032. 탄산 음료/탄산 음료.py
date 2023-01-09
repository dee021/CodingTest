e, f, c = map(int, input().split())
e += f
f = 0

while e >= c:
    f += e//c
    e = e%c + e//c
print(f)