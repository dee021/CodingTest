p, c = map(int, input().split())
if p == c+1:
    print(p+c)
elif p > c +1:
    print(c*2+1)
else:
    print(p*2-1)