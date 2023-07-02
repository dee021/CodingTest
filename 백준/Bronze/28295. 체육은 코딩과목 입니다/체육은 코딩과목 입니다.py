def sol(i):
    global p
    p += [0, 1, 2, -1][i]
    if p < 0: p += 4
    if p > 3: p -= 4

p = 0
for _ in range(10):
    sol(int(input()))
print(['N', 'E', 'S', 'W'][p])