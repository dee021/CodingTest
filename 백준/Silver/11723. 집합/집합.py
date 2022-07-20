import sys

S = set()
a = [str(x) for x in range(1, 21)]

def oper1(txt):
    if txt == 'all':
        S.clear()
        S.update(a)
    else:
        S.clear()

def oper2(txt, num):
    if txt == 'add':
        S.add(num)
    elif txt == 'remove' and num in S:
        S.remove(num)
    elif txt == 'check':
        if num in S:
            sys.stdout.write('1\n')
        else:
            sys.stdout.write('0\n')
    elif txt == 'toggle':
        if num in S:
            S.remove(num)
        else:
            S.add(num)

n = int(sys.stdin.readline())

txt = 'check'; num = '20'
for i in range(n):
    order = sys.stdin.readline().split()
    
    if len(order) == 1:
        oper1(order[0])
    else:
        oper2(order[0], order[1])