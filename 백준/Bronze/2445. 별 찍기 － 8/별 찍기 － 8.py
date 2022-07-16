n = int(input())

for i in range(1,n):
    txt = '*'*i + ' '*(n-i)
    txt = txt + txt[::-1]
    print(txt)
for i in range(n, 0, -1):
    txt = '*'*i + ' '*(n-i)
    txt = txt + txt[::-1]
    print(txt)