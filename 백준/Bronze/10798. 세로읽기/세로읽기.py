s = ['' for _ in range(5*15)]
for i in range(5):
    for idx, c in enumerate(input()):
        s[5*idx+i] = c
print(*[x for x in s if x], sep='')