import math
star = [0 for _ in range(3)]

star[0] = star[2] = '***'
star[1] = '* *'

def extendStar(num, lst):
    m = [0 for _ in range(3**num)]
    for i in range(3**num):
        m[i] = lst[i] + ' '*3**(num) + lst[i]
    for i in range(3**num):
        lst[i] = lst[i] * 3
    return lst + m + lst

n = int(input())

for i in range(1,math.ceil(math.log(n, 3))):
    star = extendStar(i, star)
print('\n'.join(star))