def x(a, b):
    tmp = int((a**2 - b)**0.5)
    return set([-a + tmp, -a - tmp])

a, b = map(int, input().split())
print(*sorted(x(a, b)))