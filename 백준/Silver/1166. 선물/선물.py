n, l, w, h = map(int, input().split())
s, b = 0, min(l, w, h)
tmp = 0
while 0 <= s < b and tmp <= 100:
    tmp += 1
    mid = (s + b)/2
    cnt = (x :=l//mid) * (y:=w//mid) * (z:=h//mid)
    
    if x * mid > l or y * mid > w or z * mid > h:
        b = mid
    elif cnt < n:
        b = mid
    else:
        s = mid

print(s)