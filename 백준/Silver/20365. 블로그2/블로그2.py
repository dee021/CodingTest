n = int(input())
b, r = 0,0
isblue = 0
first = ''
for c in input().strip():
    if not first:
        first = c
        isblue = not (c == 'B')
    if c == 'B':
        if not isblue:
            isblue = 1
            r += 1
    else:
        if isblue:
            isblue = 0
            b += 1

print(min(r, b)+1)