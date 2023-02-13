n, *s = open(0).read().split()
s = set(s)
for b in s:
    if b[::-1] in s:
        print(len(b), b[len(b)//2])
        break