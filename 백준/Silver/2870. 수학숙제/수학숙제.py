arr = []
for _ in range(int(input())):
    tmp = ''
    for c in input():
        if c.isnumeric():
            tmp += c
        elif tmp:
            arr.append(int(tmp))
            tmp = ''
    if tmp:
        arr.append(int(tmp))
print(*sorted(arr), sep='\n')