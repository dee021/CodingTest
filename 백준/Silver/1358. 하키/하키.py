w, h, x, y, p = map(int, input().split())
y1 = y + h
x1 = x + w
r = h//2

player = []
for i in range(p):
    tx, ty = map(int, input().split())
    if ty >= y and ty <= y1:
        if tx >= x and tx <= x1:
            pass
        elif tx < x:
            d = ((x-tx)**2 + (y+r-ty)**2)**0.5
            if d > r:
                continue
        else: # tx > x1
            d = ((x1-tx)**2 + (y+r-ty)**2)**0.5
            if d > r:
                continue
    else:
        continue
    player.append([tx,ty])

print(len(player))