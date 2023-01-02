import math
pi = math.pi
t = 0

while True:
    r2, c, s = map(float, input().split())
    if c == 0:
        break
    else:
        t += 1
    dis = c * r2 * pi / (12*5280)
    v = dis*(60*60)/s
    print('Trip #'+str(t)+':', '%0.2f' %dis, '%0.2f' %v)