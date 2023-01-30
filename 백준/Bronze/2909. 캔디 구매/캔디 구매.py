def round2(f):
    n, tmp = str(f).split('.')
    if tmp == '5' and int(n)%2 == 0:
        return round(f)+1
    return round(f)

c, k = map(int, input().split())
m = 10**k
c = round2(c/m)*m
print(c)