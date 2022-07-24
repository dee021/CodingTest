n = int(input())

for i in range(1,n+1):
    txt = ' '*(n-i) + '*' + ' *'*(i-1)
    print(txt)