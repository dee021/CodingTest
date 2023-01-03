a, b = 0, 0
input()
for v in input():
    if v == 'A':
        a += 1
    else:
        b += 1
if a == b:
    print('Tie')
else:
    print(a > b and 'A' or 'B')