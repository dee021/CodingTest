import math

a = list(map(int, input().split()))
b = list(map(int, input().split()))
a, b = math.ceil(a[1]/b[0]), math.ceil(b[1]/a[0])
if a == b:
    print('DRAW')
else:
    print(a > b and 'PLAYER A' or 'PLAYER B')