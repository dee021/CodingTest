from math import floor

c = ''
n = 0
while True:
    n += 1
    o = input()
    if o == '=':
        break
    c += o
    if n == 3:
        c = str(floor(eval(c)))
        n = 1
print(eval(c))