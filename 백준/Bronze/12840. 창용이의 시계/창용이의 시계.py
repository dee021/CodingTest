import sys
input = sys.stdin.readline

h, m, s = map(int, input().split())
t = h*60**2+m*60+s
for i in range(int(input())):
    o = list(map(int, input().split()))
    if len(o) == 1:
        print(t//3600, (t%3600)//60, (t%3600)%60)
    else:
        t = [0, t+o[1], t- o[1]][o[0]]
        if 0 > t:
            t += 24*3600
        t %= 24*3600