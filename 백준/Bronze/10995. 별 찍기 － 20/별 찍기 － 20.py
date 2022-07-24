n = int(input())

for i in range(n):
    if i%2 == 0:
        txt = '*' + ' *'*(n-1)
    else:
        txt = ' *' + ' *'*(n-1)
    print(txt)