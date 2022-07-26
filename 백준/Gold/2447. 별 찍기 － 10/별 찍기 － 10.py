import math
star = [0 for _ in range(3)]

star[0] = star[2] = '***'
star[1] = '* *'

def extendStar(num, lst):
    for i in range(3**num):
        lst.append(lst[i] + ' '*3**(num) + lst[i])
    for i in range(3**num):
        lst[i] = lst[i] * 3
    for i in range(3**num):
        lst.append(lst[i])
    return lst

n = int(input())

for i in range(1,math.ceil(math.log(n, 3))):
    star = extendStar(i, star)
print('\n'.join(star))