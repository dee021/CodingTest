import sys
input = sys.stdin.readline

def rnd(num):
    if num == int(num):
        return num
    p = str(num).split('.')[1]
    if len(p) < 3:
        return num
    if p[2] == '5':
        num += 0.001
    return round(num, 2)
    

s = {'A+':4.3, 'A0':4.0, 'A-':3.7, 'B+':3.3, 'B0':3.0, 'B-':2.7, 'C+':2.3, 'C0':2.0, 'C-':1.7, 'D+':1.3, 'D0':1.0, 'D-':0.7, 'F':0.0}
x, y = 0,0
for _ in range(int(input())):
    a, b, c = input().split()
    x += int(b)
    y += int(b)*s[c]
    ans = rnd(y/x)
print('%0.2f' %ans)