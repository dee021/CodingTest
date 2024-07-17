a, b = map(int, input().split())
while a < 5 and b < 5:
    b += a
    if b >= 5:
        break
    a += b
print(a > 4 and 'yj' or 'yt')