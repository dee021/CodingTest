u, d, h = input().split()
u = int(u);d = int(d);h = int(h)

dis = u-d
temp = h-u
if (temp%dis)==0:
    print((temp//dis)+1)
else:
    print((temp//dis)+2)