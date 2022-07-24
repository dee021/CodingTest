n = int(input())

for i in range(1,n+1):
    txt = ' '*(n-i) + '*'
    if i > 1 and i <n :
        txt += ' '*(2*i-3)+'*'
    if i > 1 and i == n:
        txt += '*' * (2*i-3) + '*'
    print(txt)