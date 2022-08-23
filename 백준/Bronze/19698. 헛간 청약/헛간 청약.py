n, w, h, l = map(int, input().split())

w = (w//l)*(h//l)
print(w if w<n else n)