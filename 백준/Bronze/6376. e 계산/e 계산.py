import math

print('n e\n- -----------')
e = 0
for i in range(10):
    e += 1/math.factorial(i)
    if e == int(e):
        e = int(e)
    if i < 3:
        print(i, e)
    else:
        print(i, '%0.9f' %e)