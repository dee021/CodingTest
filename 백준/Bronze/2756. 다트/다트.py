s = ['<=3', '<=6', '<=9', '<=12', '<=15', '>15']

def score(d):
    d = str(d)
    for i, r in enumerate(s):
        if eval(d+r):
            return 100-20*i

for _ in range(int(input())):
    t = list(map(float, input().split()))
    a, b = 0, 0
    for i in range(0, 6, 2):
        a += score((t[i]**2+t[i+1]**2)**0.5)
        b += score((t[6+i]**2+t[i+7]**2)**0.5)
    if a == b:
        print('SCORE: {} to {}, TIE.'.format(a, b))
    else:
        print('SCORE: {} to {}, PLAYER {} WINS.'.format(a, b, 1+(a<b)))