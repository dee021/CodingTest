xspot = [[] for _ in range(11)]
a, b, c = map(int, input().split())

for x in range(1, 11):
    if b:
        y = (-a * x + c) / b
        if 0 < y == int(y) <= 10:
            xspot[x].append(int(y))
    else:
        y = x
        x = c/a
        if x == int(x):
            xspot[int(x)].append(y)
    

for x in range(1, 11):
    if xspot[x]:
        print(*sorted(xspot[x]))
    else:
        print(0)