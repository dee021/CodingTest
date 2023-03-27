h, w, n, m = map(int, input().split())
n += 1; m += 1
print((h//n+bool(h%n))*(w//m+bool(w%m)))