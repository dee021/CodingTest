r, c, n = map(int, input().split())
print((r//n+bool(r%n))*(c//n+bool(c%n)))