def sol():
    for a in range(m):
        for c in range(m):
            if x1 == (a * seed + c) % m and x2 == (a * x1 + c) % m:
                return a, c

m, seed, x1, x2 = map(int, input().split())
print(*sol())