c = 0
x, y, w, s = map(int, input().split())

if s < 2*w:   
    c += min(x, y)
    x, y = x-min(x, y), y-min(x, y)
if s < w:
    c += (x//2 + y//2)*2
    x %= 2
    y %= 2
print(c*s + (x+y)*w)