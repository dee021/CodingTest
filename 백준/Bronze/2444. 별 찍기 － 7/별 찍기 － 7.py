n = int(input())
for i in range(1, 2*n-1, 2):
    txt = ' '*(((2*n-1)-i)//2)
    txt = txt + '*'*i
    print(txt)

for i in range(2*n-1,0,-2):
    txt = ' '*(((2*n-1)-i)//2)
    txt = txt + '*'*i
    print(txt)