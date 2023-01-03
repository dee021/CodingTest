ball = [True, False, False]

def updateBall(n, m):
    tmp = ball[n]
    ball[n] = ball[m]
    ball[m] = tmp
    return ball

def findBall(c):
    if c == 'A':
        res = updateBall(0,1)
    elif c == 'B':
        res = updateBall(1,2)
    else:
        res = updateBall(0,2)
    return res

for i in input():
    ball = findBall(i)
print(ball.index(True)+1)