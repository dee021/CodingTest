k, w, m = map(int, input().split())
w -= k
print((w//m)+bool(w%m) if w >= 0 else 0)