f, w, i = True, 'UCPC', 0
for c in input():
    if w[i] == c:
        i += 1
    if i == 4:
        f = False
        break
print(f and 'I hate UCPC' or 'I love UCPC')