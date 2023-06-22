n, m = map(int, input().split())
ans, box = 0,0

if n:
    for b in list(map(int, input().split())):
        if box + b > m:
            ans += 1
            box = b
        else:
            box += b

print(ans + bool(box))