dc = {'R': 0.55, 'G': 0.7, 'B': 0.8, 'Y': 0.85, 'O':0.9, 'W':0.95}

def userRound(f, d):
    s = '0.'+str(f).split('.')[1]
    t = float(s)
    if len(s) >= d+4 and s[d+3] == '5':
        t += 0.001 if d else -0.01
    return int(f) + round(t, d+1)

for _ in range(int(input())):
    bp, c, d, p = input().split()
    bp = float(bp)*dc[c]
    if d == 'C':
        bp *= 0.95
    dp = userRound(bp, p=='P')
    print('$%0.2f' %dp)